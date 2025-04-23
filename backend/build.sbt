// scalaのバージョン
ThisBuild / scalaVersion := "3.3.5"

// プロジェクト定義
lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "todo-backend",
    version := "0.1.0",
    crossScalaVersions := Seq("2.13.16", "3.3.5"),
    scalaVersion := crossScalaVersions.value.head,
    // Compile / unmanagedResourceDirectories += baseDirectory.value / "conf",
    // 依存ライブラリ
    libraryDependencies ++= Seq(
      guice, // scala用DIライブラリ
      "org.scalatest" %% "scalatest" % "3.2.16" % Test, // テストライブラリ
      "org.scalatestplus" %% "scalacheck-1-17" % "3.2.18.0" % Test, // // ScalaCheck
      "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0" % Test
    ),
    // Play依存に含まれるJLineが問題の原因になるのでexcludeする
    scalacOptions ++= Seq(
      "-feature",
      "-Werror"
    ),
    Test / javaOptions ++= List("--add-exports=java.base/sun.security.x509=ALL-UNNAMED")
  )
