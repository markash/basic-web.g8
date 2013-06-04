name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

scalacOptions ++= Seq("-unchecked", "-deprecation")

showSuccess  := true

showTiming   := true

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-server" % "7.3.0v20110203",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
