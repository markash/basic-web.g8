name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

scalacOptions ++= Seq("-unchecked", "-deprecation")

showSuccess  := true

showTiming   := true

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-servlet" % "7.3.0.v20110203" % "container",
  "org.eclipse.jetty" % "jetty-webapp"  % "7.3.0.v20110203" % "test, container",
  "org.eclipse.jetty" % "jetty-server"  % "7.3.0.v20110203" % "container",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
