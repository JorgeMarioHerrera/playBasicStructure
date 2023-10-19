name := """foxview-play-scala-starter"""
organization := "com.foxview"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.7"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
libraryDependencies += "net.logstash.logback" % "logstash-logback-encoder" % "6.2"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.foxview.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.foxview.binders._"
