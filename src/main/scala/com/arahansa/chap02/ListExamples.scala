package com.arahansa.chap02

object ListExamples {

  def main(args: Array[String]): Unit = {
    val emptyList = List()
    println(emptyList)

    val thrill = "Will"::"fill"::"until"::Nil
    println("thrill : "+thrill)
    println("thrill의 카운트 :" + thrill.count(s => s.length == 4))

    println("====")

    print("thrill의 드랍 라이트 :")
    println(thrill.dropRight(2))
    println("====")

    print("thrill에서 filter 로 네글자 긁은 경우 :")
    println(thrill.filter(s => s.length == 4))
    println("====")

    print("thrill에서 forall 로 끝문자 l 이 해당하는가?  :")
    println(thrill.forall(s => s.endsWith("l")))
    println("====")

    print("thrill에서 head 로 제일 첫번째 원소 반환 :: ")
    println(thrill.head)
    println("====")

    print("thrill에서 init 으로 마지막원소를 제외한 나머지 리스트 반환  :: ")
    println(thrill.init)
    println("====")

    print("thrill에서 mkString 으로 원소를 가지고서 문자열을 만듦  :: ")
    println(thrill.mkString(","))
    println("====")

    print("thrill에서 reverse 으로 거꾸로된 원소 반환  :: ")
    println(thrill.reverse)
    println("====")

    print("thrill에서 tail 인 경우 thrill 리스트의 첫 원소를 제외한 나머지 리스트를 반환  :: ")
    println(thrill.tail)
    println("====")



    print("::: 으로 두개의 리스트를 연결한 경우 : ")
    println(List("a", "b"):::List("c", "d"))
    println("====")

    println(":: 으로 두개의 리스트를 연결. 왼쪽요소가 제일 첫번째 들어가게 됨.")
    println(List("a", "b")::List("c", "d"))
  }

}
