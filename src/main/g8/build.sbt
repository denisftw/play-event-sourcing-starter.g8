name := """play-event-sourcing-starter"""
organization := "com.appliedscala.seeds.es"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.4"

lazy val root = (project in file(".")).
  enablePlugins(PlayScala)

pipelineStages := Seq(digest)

libraryDependencies ++= Seq(
  jdbc,
  evolutions,
  "com.softwaremill.macwire" %% "macros" % "2.3.3" % "provided",
  "org.postgresql" % "postgresql" % "42.2.18",
  "org.scalikejdbc" %% "scalikejdbc" % "3.5.0",
  "org.scalikejdbc" %% "scalikejdbc-config"  % "3.5.0",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3",
  "de.svenkubiak" % "jBCrypt" % "0.4.1"
)
