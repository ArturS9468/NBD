package org.nbd.com
package exercise1

object Task1 {

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def main(args: Array[String]) {
    println("Pudpunkt a: " + podpunktA())
    println("Pudpunkt b: " + podpunktB())
    println("Pudpunkt c: " + podpunktC())
  }

  def podpunktA(): String = {
    var forString = ""

    for (day <- daysOfWeek) {
      if ("Niedziela".equals(day)) {
        forString = forString + day
      } else {
        forString = forString + day + ", "
      }
    }
    forString
  }

  //if w forze
  def podpunktB(): String = {
    var forStringWithPOnly = ""
    for (day <- daysOfWeek if "P".equals(day.substring(0,1))) {
        forStringWithPOnly = forStringWithPOnly + day + ", "
    }
    forStringWithPOnly
  }

  def podpunktC(): String = {
    var iterator = 0
    var whileString = ""

    while(iterator < daysOfWeek.size){
      whileString = whileString + daysOfWeek(iterator) + ", "
      iterator = iterator + 1
    }
    whileString
  }

}


/*
1.	Stwórz 7 elementową listę zawierającą nazwy dni tygodnia. Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
a.	Pętli for
b.	Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”
c.	Pętli while
*/
