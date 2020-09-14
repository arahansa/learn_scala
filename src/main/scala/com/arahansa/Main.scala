package com.arahansa

object Main {

  def max(x:Int, y:Int): Int = {
    if(x>y)x
    else y
  }

  def main(args: Array[String]) {
    println("Hello, world!", max(1,2))
  }

}
