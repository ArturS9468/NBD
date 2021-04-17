package org.nbd.com
package excercise1

object Task2 {

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def podpunktA2(list: List[String]): String = {
    list match {
      case Nil => ""
      case x :: tail => x + ", " + podpunktA2(tail)
    }
  }

  def podpunktB2(list: List[String]): String = {
    list match {
      case Nil => ""
      case x :: tail => podpunktB2(tail) + x + ", "
    }
  }

  def main(args: Array[String]) {
    println("Funkcja rekurencyjna: " + podpunktA2(daysOfWeek))
    println("Funkcja rekurencyjna od końca: " + podpunktB2(daysOfWeek))
  }

}


/*
2.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
a.	Funkcji rekurencyjnej
b.	Funkcji rekurencyjnej wypisując elementy listy od końca
*/
