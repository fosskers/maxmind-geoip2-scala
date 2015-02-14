name := "maxmind-geoip2-scala"

organization := "com.sanoma.cda"

version := "1.3.2"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.maxmind.geoip2" % "geoip2" % "0.9.0",
  "com.twitter" %% "util-collection" % "6.23.0",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
