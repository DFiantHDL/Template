import dfhdl.*

class ID extends DFDesign:
  val x = UInt(8) <> IN init 0
  val y = UInt(8) <> OUT
  y := x.prev + 1

@main def hello: Unit =
  println("Hello, welcome to the DFHDL demo!")
  println("Printing the top:")
  val top = new ID
  top.printCodeString
