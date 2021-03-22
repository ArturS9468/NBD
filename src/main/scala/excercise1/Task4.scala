package org.nbd.com
package excercise1

object Task4 {

  val daysOfWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def foldl(): String =
  {
    daysOfWeek.foldLeft("")((m,n) => m + n + ", ")
  }
  def foldr(): String =
  {
    daysOfWeek.foldRight("")((m,n) => m + ", " + n)
  }

  def foldlWithP(): String =
  {
    daysOfWeek.foldLeft("")((m,n) =>
    {
      if("p".equalsIgnoreCase(n.substring(0,1))){
        m + n + ", "
      } else {
        m
      }
    })
  }

  def main(args: Array[String]) {
    println("Metoda foldLeft: " + foldl())
    println("Metoda foldRight: " + foldr())
    println("Metoda foldLeft tylko z nazwami na P: " + foldlWithP())
  }

}

/*
4.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
a.	Metody foldl
b.	Metody foldr
c.	Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”
*/

