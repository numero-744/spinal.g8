# $name$

## Elaborate / simulate using `sbt`

```sh
// To generate the Verilog from the example
sbt "runMain $packageName$.MyTopLevelVerilog"

// To generate the VHDL from the example
sbt "runMain $packageName$.MyTopLevelVhdl"

// To run the testbench
sbt "runMain $packageName$.MyTopLevelSim"
```

* The hardware description is into `hw/spinal/$packageName$/MyTopLevel.scala`
* The testbench is into `hw/spinal/$packageName$/MyTopLevelSim.scala`


## Elaborate / simulate using `mill`

```sh
// To generate the Verilog from the example
mill $packageName$.runMain $packageName$.MyTopLevelVerilog

// To generate the VHDL from the example
mill $packageName$.runMain $packageName$.MyTopLevelVhdl

// To run the testbench
mill $packageName$.runMain $packageName$.MyTopLevelSim
```


## If it is your are learning SpinalHDL

You can follow the tutorial on the [Getting Started][tutorial] page.

More specifically, instructions to install tools can be found on the [Install and setup][install] page.

[tutorial]: https://spinalhdl.github.io/SpinalDoc-RTD/master/SpinalHDL/Getting%20Started/index.html
[install]: https://spinalhdl.github.io/SpinalDoc-RTD/master/SpinalHDL/Getting%20Started/Install%20and%20setup.html#install-and-setup
