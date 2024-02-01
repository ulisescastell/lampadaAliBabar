package models
import kotlin.math.min

class Lampada {
    private var id: String = ""
    private var estaEncesa: Boolean = false
    private var colorInicial: String = ""
    private var rangColors: Array<String> = Array<String>(5) { "" }
    private var minIntensitat: Int = 0
    private var maxIntensitat: Int = 0

    constructor(id: String, colorInicial: String, rangColors: Array<String>, minIntensitat: Int, maxIntensitat: Int) {
        this.id = id
        this.colorInicial = colorInicial
        this.rangColors = rangColors
        this.minIntensitat = minIntensitat
        this.maxIntensitat = maxIntensitat
    }

    fun getId () :String {
        return this.id
    }

    fun getEstaEncesa (): Boolean {
        return this.estaEncesa
    }

    fun getColorInicial (): String {
        return this.colorInicial
    }

    fun getRangColors (): Array<String>  {
        return this.rangColors
    }

    fun getMinIntensitat (): Int  {
        return this.minIntensitat
    }

    fun getMaxIntensitat (): Int  {
        return this.maxIntensitat
    }

    fun setId (id: String) {
        this.id = id
    }

    fun setEstaEncesa (estaEncesa: Boolean) {
        this.estaEncesa = estaEncesa
    }

    fun setColorInicial (colorInicial: String) {
        this.colorInicial = colorInicial
    }


    fun setRangColors (rangColors: Array<String>) {
        this.rangColors = rangColors
    }

    fun setMinIntensitat (minIntensitat: Int) {
        this.minIntensitat = minIntensitat
    }

    fun setMaxIntensitat (maxIntensitat: Int) {
        this.maxIntensitat = maxIntensitat
    }

    override fun toString(): String {
        return "${this.id}, ${this.estaEncesa}, ${this.colorInicial}, ${this.rangColors.contentToString()}, ${this.minIntensitat}, ${this.maxIntensitat} "
    }




}