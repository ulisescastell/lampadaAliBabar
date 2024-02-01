package controllers
import models.Lampada
import utilities.*

fun main () {
    val l1: Lampada = Lampada("Menjador", "Blanc", arrayOf("blau", "rosa", "vermell"), 10, 50 )
    l1.encendre()
    println(l1)
}



