package sample

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.stream.ActorMaterializer

import scala.concurrent.ExecutionContext

object Main {
  def main(args: Array[String]): Unit = {
    implicit val system: ActorSystem = ActorSystem()
    implicit val materializer: ActorMaterializer = ActorMaterializer()
    implicit val executionContext: ExecutionContext = system.getDispatcher

    val res = Http().singleRequest(HttpRequest(uri = "http://localhost:9200"))
    res.onComplete {
      case scala.util.Success(v) => println(v); system.terminate()
    }


  }
}