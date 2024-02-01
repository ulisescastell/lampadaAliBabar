package models
import utilities.BLUE
import utilities.RESET
import utilities.WHITE_BACKGROUND
import utilities.YELLOW
import utilities.*

/**
 * Representa una làmpada amb capacitat per encendre's, apagar-se, canviar de color i ajustar-ne la intensitat.
 * @author ulisescastell
 * @date 2024-02-01
 */

class Lampada {
    private var id: String = ""
    private var estaEncesa: Boolean = false
    private var color: String = ""
    private var rangColors: Array<String> = Array<String>(5) { "" }
    private var minIntensitat: Int = 0
    private var maxIntensitat: Int = 0
    private var intensitat: Int = 0

    /**
     * Constructor que inicialitza una làmpada amb propietats específiques.
     * @param id Identificador únic de la làmpada.
     * @param color Color inicial de la làmpada.
     * @param rangColors Conjunt de colors que la làmpada pot adoptar.
     * @param minIntensitat Intensitat lumínica mínima.
     * @param maxIntensitat Intensitat lumínica màxima.
     * @param intensitat Intensitat lumínica inicial.
     * @author ulisescastell
     * @date 2024-02-01
     */

    constructor(id: String, color: String, rangColors: Array<String>, minIntensitat: Int, maxIntensitat: Int, intensitat: Int) {
        this.id = id
        this.color = color
        this.rangColors = rangColors
        this.minIntensitat = minIntensitat
        this.maxIntensitat = maxIntensitat
        this.intensitat = intensitat
    }

    /**
     * Encén la làmpada si aquesta està apagada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun encendre () {
        if (!this.estaEncesa) {
            this.estaEncesa = true
        }
        else {
            println(RED_BRIGHT + "La làmpada ja està encesa." + RESET)
        }
    }

    /**
     * Apaga la làmpada si aquesta està encesa.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun apagar () {
        if (this.estaEncesa) {
            this.estaEncesa = false
        }
        else {
            println(RED_BRIGHT + "La làmpada ja està apagada." + RESET)
        }
    }

    /**
     * Canvia el color de la làmpada al següent disponible en el rang de colors.
     * Requereix que la làmpada estigui encesa per a realitzar el canvi.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun canviarColor () {
        if (this.estaEncesa) {
            val posicio = this.rangColors.indexOf(this.color) // si element existeix dins array: te retorna sa posició -- si no existeix: te retorna -1
            this.color = this.rangColors[posicio+1]
        } else {
            println(RED_BRIGHT + "La làmpada ha d'estar encesa antes de poder canviar el color." + RESET)
        }
    }

    /**
     * Augmenta la intensitat de la làmpada fins a un màxim establert.
     * Requereix que la làmpada estigui encesa.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun pujarIntensitat () {
        if(this.estaEncesa) {
            if(this.intensitat == this.maxIntensitat) {
                println(RED_BRIGHT +"ATENCIÓ ---- L'intensitat introduïda ja no es pot augmentar més."+ RESET)
            }
            else {
                this.intensitat++
            }
        } else {
            println(RED_BRIGHT + "ATENCIÓ ---- La làmpada ha d'estar encesa antes de poder canviar el color." + RESET)
        }
    }

    /**
     * Disminueix la intensitat de la làmpada fins a un mínim establert.
     * Requereix que la làmpada estigui encesa.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun baixarIntensitat () {
        if(this.estaEncesa) {
            if(this.intensitat == this.minIntensitat) {
                println(RED_BRIGHT +"ATENCIÓ ---- L'intensitat introduïda ja no es pot disminuir més."+ RESET)
            }
            else {
                this.intensitat--
            }
        } else {
            println(RED_BRIGHT + "ATENCIÓ ---- La làmpada ha d'estar encesa antes de poder canviar el color." + RESET)
        }
    }

    /**
     * Obté l'identificador de la làmpada.
     * @return L'identificador de la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getId () :String {
        return this.id
    }

    /**
     * Verifica si la làmpada està encesa.
     * @return `true` si la làmpada està encesa, `false` en cas contrari.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getEstaEncesa (): Boolean {
        return this.estaEncesa
    }

    /**
     * Obté el color actual de la làmpada.
     * @return El color actual de la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getColorInicial (): String {
        return this.color
    }

    /**
     * Obté l'array de colors disponibles per canviar.
     * @return Array de colors disponibles.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getRangColors (): Array<String>  {
        return this.rangColors
    }

    /**
     * Obté la intensitat mínima que la làmpada pot tenir.
     * @return La intensitat mínima de la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getMinIntensitat (): Int  {
        return this.minIntensitat
    }

    /**
     * Obté la intensitat màxima que la làmpada pot tenir.
     * @return La intensitat màxima de la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getMaxIntensitat (): Int  {
        return this.maxIntensitat
    }

    /**
     * Obté la intensitat actual de la làmpada.
     * @return La intensitat actual de la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun getIntensitat (): Int {
        return this.intensitat
    }

    /**
     * Estableix el ID de la làmpada.
     * @param id El nou ID per a la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setId (id: String) {
        this.id = id
    }

    /**
     * Estableix l'estat d'encesa o apagada de la làmpada.
     * @param estaEncesa `true` per encendre la làmpada, `false` per apagar-la.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setEstaEncesa (estaEncesa: Boolean) {
        this.estaEncesa = estaEncesa
    }

    /**
     * Estableix el color inicial de la làmpada.
     * @param colorInicial El nou color per a la làmpada.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setColorInicial (colorInicial: String) {
        this.color = colorInicial
    }

    /**
     * Estableix el rang de colors disponibles per a la làmpada.
     * @param rangColors El nou conjunt de colors disponibles.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setRangColors (rangColors: Array<String>) {
        this.rangColors = rangColors
    }

    /**
     * Estableix la intensitat mínima de la làmpada.
     * @param minIntensitat La nova intensitat mínima.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setMinIntensitat (minIntensitat: Int) {
        this.minIntensitat = minIntensitat
    }

    /**
     * Estableix la intensitat màxima de la làmpada.
     * @param maxIntensitat La nova intensitat màxima.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setMaxIntensitat (maxIntensitat: Int) {
        this.maxIntensitat = maxIntensitat
    }

    /**
     * Estableix la intensitat actual de la làmpada.
     * @param intensitat La nova intensitat actual.
     * @author ulisescastell
     * @date 2024-02-01
     */

    fun setIntensitat (intensitat: Int) {
        this.intensitat = intensitat
    }

    /**
     * Retorna una representació en cadena de text de l'estat actual de la làmpada.
     * @return Cadena de text que descriu l'estat de la làmpada, incloent ID, estat, color i intensitat.
     * @author ulisescastell
     * @date 2024-02-01
     */

    override fun toString(): String {
        return "$WHITE-----------LÀMPADA-----------\n" +
                "ID de la làmpada: $BLUE${this.id}$RESET\n" +
                "Estat de la làmpada: ${if (this.estaEncesa) "$GREEN${this.estaEncesa}" else "$RED${this.estaEncesa}"}$RESET\n" +
                "Color de la làmpada: $YELLOW${this.color}$RESET\n" +
                "Intensitat actual: $PURPLE${this.intensitat}$RESET"
    }

}