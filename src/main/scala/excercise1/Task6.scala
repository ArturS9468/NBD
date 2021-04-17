package org.nbd.com
package excercise1

object Task6 {

  def tripleFunction(myTouple: (String, Int, Double)): Unit =
  {
    println(myTouple)
  }

  def main(args: Array[String]) {
    tripleFunction(("myString", 12, 36.123))
  }

}

/*6.	Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je*/
