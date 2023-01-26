ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "$scalaVersion$"
ThisBuild / organization := "$organization$"

val spinalVersion = "$spinalVersion$"
val spinalCore = "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion
val spinalLib = "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion
val spinalIdslPlugin = compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)

lazy val $packageName$ = (project in file("."))
  .settings(
    Compile / scalaSource := baseDirectory.value / "hw" / "spinal",
    libraryDependencies ++= Seq(spinalCore, spinalLib, spinalIdslPlugin)
  )

fork := true
