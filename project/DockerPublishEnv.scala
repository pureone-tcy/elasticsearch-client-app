import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import com.typesafe.sbt.packager.NativePackagerKeys

object DockerPublishEnv extends NativePackagerKeys {
  
  val repositoryUri = "hoge"

  def dockerCommonSettings = Seq(
    dockerBaseImage := s"$repositoryUri/hoge",
    maintainer in Docker := "hoge",
    dockerRepository := Some(repositoryUri)
  )
}
