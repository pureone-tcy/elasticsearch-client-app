import java.io.PrintWriter

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.stream.ActorMaterializer

import scala.concurrent.ExecutionContext

object Bootstrap {
  def main(args: Array[String]): Unit = {

//    implicit val system: ActorSystem = ActorSystem()
//    implicit val materializer: ActorMaterializer = ActorMaterializer()
//    implicit val executionContext: ExecutionContext = system.getDispatcher

//    val res = Http().singleRequest(HttpRequest(uri = "http://localhost:9200"))
//    res.onComplete {
//      case scala.util.Success(v) => println(v); system.terminate()
//      case scala.util.Failure(e) => println("tsuchiya"); system.terminate()
//    }

    FileIO(new PrintWriter(("./output.text"))) { out =>
      out.write("test tsuchiya!")
      println("end")
    }
  }
}
