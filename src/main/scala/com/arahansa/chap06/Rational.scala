package com.arahansa.chap06

class Rational(n:Int, d:Int) {
  require(d!=0)
  private val g = gcd(n.abs, d.abs)
  val number: Int = n
  val denom : Int = d

  def this(n : Int) = this(n,1) // 보조 생성자

  override def toString = number +"/" + denom

  def add(that: Rational) : Rational =
    new Rational(number * that.denom + that.number * denom, denom * that.denom)

  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom

  def max(that : Rational) = if(this.lessThan(that)) that else this

  private def gcd(a:Int, b:Int) : Int = if(b==0) a else gcd(b, a%b)
}
