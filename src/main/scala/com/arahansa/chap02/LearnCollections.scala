package com.arahansa.chap02

object LearnCollections {

  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet +="Lear"
    println(jetSet.contains("Cessna"))
    println(jetSet)

    val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }

}
