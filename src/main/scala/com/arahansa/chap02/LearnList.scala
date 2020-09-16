package com.arahansa.chap02

object LearnList {

  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1,2,3)
    println(oneTwoThree)

    val oneTwo = List(1,2)
    val threeFour= List(3,4)
    val oneTwoThreeFour = oneTwo:::threeFour

    println(oneTwo+" and "+ threeFour+" were not mutated.")
    println("Thus, "+oneTwoThreeFour+" is a new list")

    val twoThree = List(2,3)
    val oneTwoThreeCons = 1 :: twoThree
    println(oneTwoThreeCons)
  }

}
