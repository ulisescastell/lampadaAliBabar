package controllers
import models.Lampada
import utilities.*

fun main () {
    val l1: Lampada = Lampada("Menjador", "Blanc", arrayOf("Blanc", "Blau", "Rosa", "Vermell", "Taronja"), 1, 5 , 3)
    val l2: Lampada = Lampada("Cuina", "Rosa", arrayOf("Rosa", "Taronja", "Groc", "Blau", "Fúxia", "Magnenta"), 1,10,8)

    println("$RED\n---------Làmpada 1:-------$RESET")

    println(l1)
    l1.encendre()
    println(l1)
    l1.canviarColor()
    println(l1)
    l1.canviarColor()
    println(l1)
    l1.canviarColor()
    println(l1)
    l1.pujarIntensitat()
    println(l1)
    l1.pujarIntensitat()
    println(l1)
    l1.pujarIntensitat()
    println(l1)
    //extra
    l1.baixarIntensitat()
    println(l1)
    l1.baixarIntensitat()
    println(l1)
    l1.baixarIntensitat()
    println(l1)
    l1.baixarIntensitat()
    println(l1)
    l1.baixarIntensitat()
    println(l1)

    println("$RED\n---------Làmpada 2:-------$RESET")

    println(l2)
    l2.encendre()
    println(l2)
    l2.canviarColor()
    println(l2)
    l2.canviarColor()
    println(l2)
    l2.canviarColor()
    println(l2)
    l2.pujarIntensitat()
    println(l2)
    l2.pujarIntensitat()
    println(l2)
    l2.apagar()
    println(l2)
    l2.canviarColor()
    println(l2)
    l2.encendre()
    println(l2)
    l2.canviarColor()
    println(l2)
    l2.pujarIntensitat()
}



