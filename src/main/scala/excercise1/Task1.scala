package org.nbd.com
package excercise1

object Task1 extends App {
  println("Hello, World!")

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  var forString = ""

  for (day <- daysOfWeek) {
    if ("Niedziela".equals(day)) {
      forString = forString + day
    } else {
      forString = forString + day + ", "
    }
  }
  println("Podpunkt a: " + forString)

  var forStringWithPOnly = ""

  for (day <- daysOfWeek) {
    if ("P".equals(day.substring(0,1))) {
      forStringWithPOnly = forStringWithPOnly + day + ", "
    }
  }
  println("Podpunkt b: " +forStringWithPOnly)
  var iterator = 0
  var whileString = ""


  while(iterator < daysOfWeek.size){
    whileString = whileString + daysOfWeek(iterator) + ", "
    iterator = iterator + 1
  }
  println("Podpunkt c: " +whileString)

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    sum
  }

}


/*
1.	Stwórz 7 elementową listę zawierającą nazwy dni tygodnia. Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
a.	Pętli for
b.	Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”
c.	Pętli while
*/
