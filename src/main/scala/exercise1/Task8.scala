package org.nbd.com
package exercise1

object Task8 {

  val numbers: List[Int] = List(1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 0, 9, 0)

  def remove[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case x :: t => {
      if(x!=0) {
        x :: remove(t)
      } else {
        remove(t)
      }
    }
  }

  def main(args: Array[String]) {
    println(numbers)
    print(remove(numbers))
  }
}

//8.	Napisz funkcję usuwającą zera z listy wartości całkowitych (tzn. zwracającą listę elementów mających wartości różne od 0).  Wykorzystaj rekurencję.