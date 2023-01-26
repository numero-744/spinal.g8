import mill._, scalalib._

val spinalVersion = "$spinalVersion$"

object $packageName$ extends SbtModule {
  def scalaVersion = "$scalaVersion$"
  override def millSourcePath = os.pwd
  def sources = T.sources(
    millSourcePath / "hw" / "spinal"
  )
  def ivyDeps = Agg(
    ivy"com.github.spinalhdl::spinalhdl-core:\$spinalVersion",
    ivy"com.github.spinalhdl::spinalhdl-lib:\$spinalVersion"
  )
  def scalacPluginIvyDeps = Agg(ivy"com.github.spinalhdl::spinalhdl-idsl-plugin:\$spinalVersion")
}
