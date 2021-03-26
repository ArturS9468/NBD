package org.nbd.com
package exercise2


object Task2 {

  def main(args: Array[String]): Unit = {

    val kontoBankowe = new KontoBankowe(100)
    println("Kwota poczatkowa: " + kontoBankowe.pokazStanKonta())
    kontoBankowe.wplata(50)
    println("Kwota po wplacie: " + kontoBankowe.pokazStanKonta())
    kontoBankowe.wyplata(75)
    println("Kwota po wyplacie: " + kontoBankowe.pokazStanKonta())

    val pusteKontoBankowe = new KontoBankowe()
    println("Kwota poczatkowa pustego konta: " + pusteKontoBankowe.pokazStanKonta())
    pusteKontoBankowe.wplata(25)
    println("Kwota po wplacie na puste konto: " + pusteKontoBankowe.pokazStanKonta())

  }

}
