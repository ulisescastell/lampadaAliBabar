package controllers
import models.Lampada
import utilities.*

fun main () {
    val l1: Lampada = Lampada("Menjador", "Blanc", arrayOf("blau", "rosa", "vermell"), 1, 5 )
    l1.encendre()
    println(l1)
    l1.apagar()
    println(l1)
}



