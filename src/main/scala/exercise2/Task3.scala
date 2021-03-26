package org.nbd.com
package exercise2

object Task3 {

  def main(args: Array[String]): Unit = {
    val ania = Osoba("Ania", "Aniowska")
    val tomasz = Osoba("Tomasz", "Tomaszewski")
    val karol = Osoba("Karol", "Kowalski")
    println(matchGreeting(ania))
    println(matchGreeting(tomasz))
    println(matchGreeting(karol))
  }


  def matchGreeting(x: Osoba): String = x match {
    case Osoba("Ania", "Aniowska") => "Hej Ania"
    case Osoba("Tomasz", "Tomaszewski") => "Witaj Tomasz"
    case _ => "Dzień dobry nieznajomy"
  }

}
