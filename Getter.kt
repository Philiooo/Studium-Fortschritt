fun main(){

    val sportwagen: Fahrzeug = Sportwagen("Ferrari")
    sportwagen.beschleunigung(100)
    println(sportwagen.geschwindigkeit)
    println(sportwagen.marke)

    val lkw: Fahrzeug = LKW("MAN")
    lkw.beschleunigung(70)
    println(lkw.geschwindigkeit)
    println(lkw.marke)

}
interface Fahrzeug{
    var marke: String
    var geschwindigkeit: Int
    fun beschleunigung(incremet: Int)
    fun bremsen(decrement: Int)
}
abstract class Auto(override var marke: String,
                    override var geschwindigkeit: Int = 0

):Fahrzeug {

    override fun beschleunigung(incremet: Int) {
        if (incremet > 0){
            geschwindigkeit += incremet
        }
    }

    override fun bremsen(decrement: Int) {
        if (decrement > 0){
            geschwindigkeit -= decrement
            if (geschwindigkeit < 0){
                geschwindigkeit = 0
            }
        }
    }
    abstract fun fahren(): String
}


class Sportwagen(marke: String): Auto(marke){

    override var geschwindigkeit: Int = 0
        get() {
            println("Aktuelle Geschwindigkeit des Sportwagens: $field km/h")
            return field
        }
        set(value){
            field = value
        }

    override fun fahren(): String{
        return "Der Sportwagen fährt sehr schnell."
    }
}

class LKW(marke: String): Auto(marke){

    override var geschwindigkeit: Int = 0
        get() {
            println("Aktuelle Geschwindigkeit des LWK: $field km/h")
            return field
        }

    override fun fahren(): String {
        return "Der LKW fährt langsam"
    }


}
