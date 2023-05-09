lazy val root = (project in file(".")).
  settings(
    organization := "com.tencent.ads",
    name := "marketing-api-java-sdk",
    version := "1.1.55",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.17",
      "com.squareup.okhttp" % "okhttp" % "2.7.5",
      "com.squareup.okhttp" % "logging-interceptor" % "2.7.5",
      "com.google.code.gson" % "gson" % "2.8.1",
      "org.threeten" % "threetenbp" % "1.3.5" % "compile",
      "io.gsonfire" % "gson-fire" % "1.8.0" % "compile",
      "com.google.inject" % "guice" % "4.0",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
