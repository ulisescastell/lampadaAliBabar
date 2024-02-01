package controllers
import models.Lampada
import utilities.*

fun main () {
    val l1: Lampada = Lampada("Menjador", "blanc", arrayOf("blanc", "blau", "rosa", "vermell"), 1, 5 , 1)
    val l2: Lampada = Lampada("Cuina", "Blau", arrayOf("lila, taronja, vermell"), 1,10,5)
    l1.encendre()
    println(l1)
    l1.apagar()
    println(l1)
    l1.encendre()
    println(l1)
    l1.canviarColor()
    println(l1)
}



