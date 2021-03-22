package org.nbd.com
package excercise1

object Task2 {

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def podpunktA(i: Int): String = {
    if (i == 6) daysOfWeek.last
    else daysOfWeek(i) + ", " + podpunktA(i+1)
  }

  def podpunktB(i: Int): String = {
    if (i == 6) daysOfWeek.last
    else daysOfWeek(daysOfWeek.size-1-i) + ", " + podpunktA(i+1)
  }

  def main(args: Array[String]) {
    println("Funkcja rekurencyjna: " + podpunktA(0))
    println("Funkcja rekurencyjna od końca: " + podpunktB(0))
  }

}

/*
2.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
a.	Funkcji rekurencyjnej
b.	Funkcji rekurencyjnej wypisując elementy listy od końca
*/
