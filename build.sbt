name := "first-bull"

version := "0.1"

scalaVersion := "2.13.4"

val Http4sVersion = "0.21.5"

libraryDependencies ++= Seq(
  "com.monovore" %% "decline" % "1.3.0",
  "org.scalaj" % "scalaj-http_2.11" % "2.3.0",
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
)