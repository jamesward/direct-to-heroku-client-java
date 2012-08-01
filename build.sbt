name := "direct-to-heroku-client"

libraryDependencies ++= Seq(
  "com.sun.jersey" % "jersey-client" % "1.8",
  "com.sun.jersey" % "jersey-json" % "1.8",
  "com.sun.jersey" % "jersey-core" % "1.8",
  "com.sun.jersey.contribs" % "jersey-multipart" % "1.8",
  "junit" % "junit" % "4.9" % "test"
)

javacOptions ++= Seq("-source", "1.5", "-target", "1.5")
