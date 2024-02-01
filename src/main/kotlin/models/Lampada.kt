package models
import utilities.BLUE
import utilities.RESET
import utilities.WHITE_BACKGROUND
import utilities.YELLOW

/**
 * Representa una làmpada que pot ser encesa, apagada, canviar el seu color i intensitat.
 * @property id Identificador de la làmpada.
 * @property estaEncesa Indica si la làmpada està encesa o apagada.
 * @property color Color actual de la làmpada.
 * @property rangColors Array de colors disponibles per a la làmpada.
 * @property minIntensitat Intensitat mínima de la làmpada.
 * @property maxIntensitat Intensitat màxima de la làmpada.
 * @property intensitat Intensitat actual de la làmpada.
 * @constructor Crea una nova instància de la làampada amb els paràmetres especificats.
 * @author ulisescastell
 * @since 01/02/2024
 */

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

    /**
     * Encén la làmpada.
     * @author @ulisescastell
     * @since 01/02/2024
     */
    fun encendre() {
        if (!this.estaEncesa) {
            this.estaEncesa = true
        }
        else {
            println(YELLOW + "La làmpada ja està encesa" + RESET)
        }
    }

    /**
     * Apaga la làmpada.
     * @author @ulisescastell
     * @since 01/02/2024
     */
    fun apagar() {
        if (this.estaEncesa) {
            this.estaEncesa = false
        }
        else {
            println(YELLOW + "ATENCIÓ ---- La làmpada ja està apagada" + RESET)
        }
    }

    /**
     * Canvia el color actual de la làmpada al següent disponible en el rang de colors.
     * @author @ulisescastell
     * @since 01/02/2024
     */
    fun canviarColor() {
        if (this.estaEncesa) {
            val posicio = this.rangColors.indexOf(this.color)
            this.color = if (posicio == this.rangColors.size - 1) this.rangColors[0] else this.rangColors[posicio + 1]
        } else {
            println(YELLOW + "ATENCIÓ ---- La làmpada ha d'estar encesa abans de poder canviar el color" + RESET)
        }
    }

    /**
     * Augmenta la intensitat de la làmpada, sense excedir la intensitat màxima.
     * @author @ulisescastell
     * @since 01/02/2024
     */
    fun pujarIntensitat() {
        if(this.estaEncesa) {
            if(this.intensitat == this.maxIntensitat) {
                println(YELLOW +"ATENCIÓ ---- L'intensitat introduïda ja no es pot augmentar més"+ RESET)
            }
            else {
                this.intensitat++
            }
        } else {
            println(YELLOW + "ATENCIÓ ---- La làmpada ha d'estar encesa abans de poder augmentar la intensitat" + RESET)
        }
    }

    /**
     * Disminueix la intensitat de la làmpada, sense anar per sota de la intensitat mínima.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun baixarIntensitat() {
        if(this.estaEncesa) {
            if(this.intensitat == this.minIntensitat) {
                println(YELLOW + "ATENCIÓ ---- L'intensitat introduïda ja no es pot disminuir més" + RESET)
            }
            else {
                this.intensitat--
            }
        } else {
            println(YELLOW + "ATENCIÓ ---- La làmpada ha d'estar encesa abans de poder disminuir la intensitat" + RESET)
        }
    }

    /**
     * Retorna l'identificador de la làmpada.
     * @return L'ID de la làmpada.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getId(): String {
        return this.id
    }

    /**
     * Indica si la làmpada està encesa.
     * @return `true` si la làmpada està encesa, `false` en cas contrari.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getEstaEncesa(): Boolean {
        return this.estaEncesa
    }

    /**
     * Retorna el color inicial de la làmpada.
     * @return El color actual de la làmpada.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getColorInicial(): String {
        return this.color
    }

    /**
     * Retorna el rang de colors disponibles per a la làmpada.
     * @return Un array amb els colors disponibles.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getRangColors(): Array<String> {
        return this.rangColors
    }

    /**
     * Retorna la intensitat mínima que pot tenir la làmpada.
     * @return La intensitat mínima de la làmpada.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getMinIntensitat(): Int {
        return this.minIntensitat
    }

    /**
     * Retorna la intensitat màxima que pot tenir la làmpada.
     * @return La intensitat màxima de la làmpada.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getMaxIntensitat(): Int {
        return this.maxIntensitat
    }

    /**
     * Retorna la intensitat actual de la làmpada.
     * @return La intensitat actual de la làmpada.
     * @author ulisescastell
     * @since 01/02/2024
     */
    fun getIntensitat(): Int {
        return this.intensitat
    }

    /**
     * Representació en cadena de la làmpada que inclou el seu ID, estat, color i intensitat.
     * @return Una cadena que representa la làmpada.
     * @author ulisescastell
     * @since 01/02/2024
     */
    override fun toString(): String {
        return BLUE + "\n-----------LÀMPADA-----------\nID de la làmpada: ${this.id}\nEstat de la làmpada: ${this.estaEncesa}\nColor de la làmpada: ${this.color}\nIntensitat actual: ${this.intensitat}" + RESET
    }
}

