import Dependencies._
import DockerPublishEnv._

name := "sample"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.7",
  version      := "0.1.0-SNAPSHOT"
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(core, sample)

lazy val core = (project in file("core"))
  .settings(
    name := "core",
    commonSettings
  )

lazy val sample = (project in file("sample"))
  .settings(
    name := "sample",
    commonSettings,
    dockerBaseImage := "java:8-jdk-alpine",
    libraryDependencies ++= akkaDependencies
  )
  .enablePlugins(JavaAppPackaging, AshScriptPlugin, DockerPlugin)
//  .settings(dockerCommonSettings: _*)
  .dependsOn(core)
