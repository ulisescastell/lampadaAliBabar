package models
import utilities.BLUE
import utilities.RESET
import utilities.WHITE_BACKGROUND
import utilities.YELLOW

class Lampada {
    private var id: String = ""
    private var estaEncesa: Boolean = false
    private var color: String = ""
    private var rangColors: Array<String> = Array<String>(5) { "" }
    private var minIntensitat: Int = 0
    private var maxIntensitat: Int = 0
    private var intensitat: Int = 0

    constructor(id: String, color: String, rangColors: Array<String>, minIntensitat: Int, maxIntensitat: Int, intensitat: Int) {
        this.id = id
        this.color = color
        this.rangColors = rangColors
        this.minIntensitat = minIntensitat
        this.maxIntensitat = maxIntensitat
        this.intensitat = intensitat
    }

    fun encendre () {
        if (!this.estaEncesa) {
            this.estaEncesa = true
        }
        else {
            println(YELLOW + "La làmpada ja està encesa" + RESET)
        }
    }

    fun apagar () {
        if (this.estaEncesa) {
            this.estaEncesa = false
        }
        else {
            println(YELLOW + "La làmpada ja està apagada" + RESET)
        }
    }

    fun canviarColor () {fdsaf
        if (estaEncesa) {
            val posicio dasf
            for (element in rangColors) {
                this.color = element
            }
        } else {
            println(YELLOW + "La làmpada ha d'estar encesa antes de poder canviar el color" + RESET)
        }
    }

    fun getId () :String {
        return this.id
    }

    fun getEstaEncesa (): Boolean {
        return this.estaEncesa
    }

    fun getColorInicial (): String {
        return this.color
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

    fun getIntensitat (): Int {
        return this.intensitat
    }

    fun setId (id: String) {
        this.id = id
    }

    fun setEstaEncesa (estaEncesa: Boolean) {
        this.estaEncesa = estaEncesa
    }

    fun setColorInicial (colorInicial: String) {
        this.color = colorInicial
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

    fun setIntensitat (intensitat: Int) {
        this.intensitat = intensitat
    }

    override fun toString(): String {
        return BLUE + "\n-----------Menú-----------\nID de la làmpada: ${this.id}\nEstat de la làmpada: ${this.estaEncesa}\nColor de la làmpada: ${this.color}\nIntensitat actual: ${this.intensitat}" + RESET
    }




}