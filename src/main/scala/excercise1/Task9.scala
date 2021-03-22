package org.nbd.com
package excercise1

object Task9 {

  val numbers: List[Int] = List(1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 0, 9, 0)

  def square(a:Int):Int =
  {
    a+1
  }

  def increaseValues(list : List[Int]) : List[Int] = {
    list.map(square)
  }

  def main(args: Array[String]): Unit = {
    val newNumbers = increaseValues(numbers)
    println("Old numbers: " + numbers)
    println("New numbers: " + newNumbers)
  }
}


//9.	Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną na jej podstawie listę, w której wszystkie liczby zostały zwiększone o 1. Wykorzystaj mechanizm mapowania kolekcji.
