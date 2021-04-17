package org.nbd.com
package exercise2

abstract class Osoba2 (val imie: String, val nazwisko: String){

  def getImie(): String = {
    imie
  }

  def getNazwisko(): String = {
    nazwisko
  }

  def getPodatek() : Double
}
