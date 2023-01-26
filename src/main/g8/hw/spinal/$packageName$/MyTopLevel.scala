package $packageName$

import spinal.core._

// Hardware definition
case class MyTopLevel() extends Component {
  val io = new Bundle {
    val cond0 = in  port Bool()
    val cond1 = in  port Bool()
    val flag  = out port Bool()
    val state = out port UInt(8 bits)
  }

  val counter = Reg(UInt(8 bits)) init 0

  when(io.cond0) {
    counter := counter + 1
  }

  io.state := counter
  io.flag  := (counter === 0) | io.cond1
}

object MyTopLevelVerilog extends App {
  Config.spinal.generateVerilog(MyTopLevel())
}

object MyTopLevelVhdl extends App {
  Config.spinal.generateVhdl(MyTopLevel())
}
