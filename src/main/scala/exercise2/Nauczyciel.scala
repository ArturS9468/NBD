package org.nbd.com
package exercise2

trait Nauczyciel extends Osoba2 with Pracownik {

  override def getPodatek(): Double = pensja*0.1

}
