package org.nbd.com
package exercise2

object Task5 {

  def main(args: Array[String]): Unit = {

    val pracownik = new Osoba2("Czarek", "Czarkowski") with Pracownik {
      var pensja: Double = 100
    }
    println(s"Dla pracownika: ${pracownik.getImie()}")
    println(pracownik.getPensja())
    println(pracownik.getPodatek())

    val nauczyciel = new Osoba2("Marek", "Markowski") with Nauczyciel {
      var pensja: Double = 100
    }
    println(s"Dla nauczyciela: ${nauczyciel.getImie()}")
    println(nauczyciel.getPensja())
    println(nauczyciel.getPodatek())

    val student = new Osoba2("Jarek", "Jarkowski") with Student
    println(s"Dla studenta: ${student.getImie()}")
    println(s"Podatek: ${student.getPodatek()}")

    val mixStudent = new Osoba2("Franek", "Frankowski") with Student with Pracownik {
      var pensja: Double = 70
    }
    println(s"Dla mixa zaczynajac od studenta: ${mixStudent.getImie()}")
    println(s"Podatek: ${mixStudent.getPodatek()}")


    val mixPracownik = new Osoba2("Bronek", "Bronkowski") with Pracownik with Student {
      var pensja: Double = 45
    }
    println(s"Dla mixa zaczynajac od pracownika: ${mixPracownik.getImie()}")
    println(s"Podatek: ${mixPracownik.getPodatek()}")

  }
}
