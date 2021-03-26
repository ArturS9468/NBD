package org.nbd.com
package excercise1

object Task7 {

  val products = Map("jablko" -> 1.5,
    "banan" -> 2.6,
    "woda" -> 5.1,
    "mieso" -> 11.12,
    "chleb" -> 3.44)

  def getCostOfProduct(x: Option[Double]) = x match {
    case Some(s) => s
    case None => "404"
  }

  def main(args: Array[String]) {
    println("Cost of banan: " + getCostOfProduct(products.get( "banan")) )
    println("Cost of cukierek: " + getCostOfProduct(products.get( "cukierek")) )
  }

}

/*7.	Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której wyszukujemy wartości po kluczu)*/
