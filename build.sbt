val root = project.in(file("."))
  .settings(
    scalaVersion := "3.0.0",
    // comment out the line below to pass compilation!
    scalacOptions := Seq("-source", "future", "-Yexplicit-nulls", "-Ysafe-init"),
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test,
  )
