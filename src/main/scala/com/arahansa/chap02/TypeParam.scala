package com.arahansa.chap02

object TypeParam {

  def main(args: Array[String]): Unit = {
    val greetStrings = new Array[String](3)
    greetStrings(0)= "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!\n"
    for (i <- 0 to 2)
      print(greetStrings(i))
  }
}
