package org.nbd.com
package excercise1

object Task5 {

  val products = Map("jablko" -> 1.5,
                   "banan" -> 2.6,
                   "woda" -> 5.1,
                   "mieso" -> 11.12,
                   "chleb" -> 3.44)


  def square(a:Double):Double =
  {
    a*0.9
  }

  def main(args: Array[String]): Unit = {
    val newMapV2 = products.mapValues(square).toList
    println("Old map: " + products)
    println("New map v2: " + newMapV2)
  }

}


/*5.	Stwórz mapę z nazwami produktów i cenami. Na jej podstawie wygeneruj drugą, z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji. */
