fun main(){
    // Aufgabe 1: Funktionsreferenz

    // Funktion `square` erstellen
    fun square(x: Int): Int {
        return x * x
    }
    fun printNumber(number: Int) {
        println(number)
    }

    val numbers = listOf(1, 2, 3, 4, 5)

    numbers.forEach(::printNumber)


// Referenz auf die Funktion `square` erstellen und anwenden
    val squaredNumbers = numbers.map(::square)
    println(squaredNumbers) // Ausgabe: [1, 4, 9, 16, 25]

// Aufgabe 2: Property-Referenz

    // Datenklasse `Book` erstellen
    data class Book(val title: String, var price: Double)

// Instanz von `Book` erstellen
    val book = Book("Kotlin Programming", 29.99)

// Property-Referenzen erstellen und Werte ausgeben
    val titleProperty = book::title
    val priceProperty = book::price

    println("Title: ${titleProperty.get()}") // Ausgabe: Title: Kotlin Programming
    println("Price: ${priceProperty.get()}") // Ausgabe: Price: 29.99

// Wert der `price`-Eigenschaft ändern
    priceProperty.set(24.99)
    println("New Price: ${priceProperty.get()}") // Ausgabe: New Price: 24.99
}

