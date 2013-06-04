import sbt._
import Keys._

object $name$Build extends Build {
    val hello = TaskKey [Unit] ("hello", "Prints `Hello World`")

    val helloTask: Setting[Task[Unit]] = hello := {
        println("Hello World")
    }

    val project = Project ("example", file(".")).settings(helloTask)
}
