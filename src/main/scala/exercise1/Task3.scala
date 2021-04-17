package org.nbd.com
package exercise1

import scala.annotation.tailrec

object Task3 {

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def ogonowa2(list: List[String]): String =
  {
    @tailrec def ogonowaAcc2(acumulator: String, list: List[String]): String =
    {
      list match {
        case Nil => acumulator
        case x :: tail => ogonowaAcc2(acumulator + x + ", " , tail)
      }
    }
    ogonowaAcc2("", list)
  }

  def main(args: Array[String]) {
    println("Funkcja rekurencyjna ogonowa: " + ogonowa2(daysOfWeek))
  }

}

/*
3.	Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1
*/

