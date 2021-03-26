package org.nbd.com
package exercise2

object Task1 {

  def main(args: Array[String]) {
    println(matchDayOfWeek("Sobota"))
    println(matchDayOfWeek("Wtorek"))
    println(matchDayOfWeek("Piątek"))
    println(matchDayOfWeek("świątek"))
  }


  def matchDayOfWeek(x: String): String = x match {
    case "Sobota" | "Niedziela" => "Weekend"
    case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => "Praca"
    case _ => "Nie ma takiego dnia"
  }


}
