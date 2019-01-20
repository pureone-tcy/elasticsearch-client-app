import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import com.typesafe.sbt.packager.NativePackagerKeys

object DockerPublishEnv extends NativePackagerKeys {
  
  val repositoryUri = sys.env.getOrElse("ECR_REPOSITORY_URL", "default")

  def dockerCommonSettings = Seq(
    dockerBaseImage := s"$repositoryUri/hoge",
    maintainer in Docker := "pureonedoya",
    dockerRepository := Some(repositoryUri)
  )
}
