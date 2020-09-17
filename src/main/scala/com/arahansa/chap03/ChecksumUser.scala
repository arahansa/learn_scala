package com.arahansa.chap03

object ChecksumUser {

  def main(args: Array[String]): Unit = {
    val acc = new ChecksumAccumulator()
    println(acc.checksum())
    acc.add(1)
    println(acc.checksum())

  }

}
