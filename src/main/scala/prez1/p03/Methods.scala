package prez1.p03

object Methods {

  def noArgList = 0

  def oneEmptyArgList() = 1

  def oneNotEmptyArgList(arg1: Int) = arg1 + 1

  def oneDoubleArgList(arg1: Int, arg2: Int) = arg1 + arg2 + 1

  def twoArgList(arg1: Int)(arg2: Int) = arg1 + arg2 + 2

  noArgList
//  noArgList()

  oneEmptyArgList
  oneEmptyArgList()

  oneNotEmptyArgList(1)

  oneDoubleArgList(1, 2)

  twoArgList(1)(2)

  val partialAppliedOneDoubleArgList = twoArgList(1) _
  partialAppliedOneDoubleArgList(2)

}
