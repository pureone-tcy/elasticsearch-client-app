import sbt._

object Dependencies {

  val akkaV     = "2.5.19"
  val akkaHttpV = "10.1.7"
  val scalaTest = "3.0.5"

  lazy val akkaDependencies = Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-http" % akkaHttpV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV % Test,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaV % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV % Test
  )

  lazy val scalatest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5"
  )
}
