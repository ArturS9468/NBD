package org.nbd.com
package exercise2

trait Student extends Osoba2 {

  override val podatek  = 0L

  override def getPodatek(): Double = {
    podatek
  }


}
