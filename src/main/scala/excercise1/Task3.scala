package org.nbd.com
package excercise1

import scala.annotation.tailrec

object Task3 {

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def ogonowa(n: Int): String =
  {
    @tailrec def ogonowaAcc(acc: String, n: Int): String =
    {
      if (n == daysOfWeek.size)
        acc
      else
        ogonowaAcc(acc + ", " + daysOfWeek(n), n + 1)
    }
    ogonowaAcc(daysOfWeek(n-1), n)
  }

  def main(args: Array[String]) {
    println("Funkcja rekurencyjna ogonowa: " + ogonowa(1))
  }

}

/*
3.	Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1
*/

