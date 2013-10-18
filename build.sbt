import play.Project._

name := "generator-demo"

scalaVersion := "2.10.2"

playScalaSettings

activerecordSettings

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % "0.2.4-SNAPSHOT",
  "com.github.aselab" %% "scala-activerecord-play2" % "0.2.4-SNAPSHOT",
  jdbc,
  "com.h2database" % "h2" % "1.3.172"
)

templatesImport += "com.github.aselab.activerecord.views.dsl._"
