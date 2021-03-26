package org.nbd.com
package excercise1

object Task6 {

  def toupleFunction(myTouple: (String, Int, Double)): Unit =
  {
    println(myTouple)
  }

  def main(args: Array[String]) {
    toupleFunction(("String", 12, 36.123))
  }

}

/*6.	Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je*/
