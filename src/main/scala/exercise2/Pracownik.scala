package org.nbd.com
package exercise2

trait Pracownik extends Osoba2 {

  var pensja: Double
  override val podatek = 20L

  def setPensja(x: Double) {
    pensja = x
  }

  def getPensja(): Double = {
    pensja
  }

  override def getPodatek(): Double = {
    podatek
  }

}
