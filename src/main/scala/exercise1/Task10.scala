package org.nbd.com
package exercise1

object Task10 {

  val numbers: List[Int] = List(1, -22, 0, -2, 4, -1, 5, 6, 3, -5, -4, 12, 95, 123, 5, 11)

  def absolute(a:Int):Int =
  {
    a.abs
  }

  def getAbsolutesInRange(list : List[Int]) : List[Int] = {
    list.filter(_>=(-5)).filter(_<=12).map(absolute)
  }

  def main(args: Array[String]): Unit = {
    val newNumbers = getAbsolutesInRange (numbers)
    println ("Old numbers: " + numbers)
    println ("New numbers: " + newNumbers)
  }

}


//10.	Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną na jej podstawie listę
// zawierającą wartości bezwzględne elementów z oryginalnej listy należących do przedziału <-5,12>. Wykorzystaj filtrowanie.