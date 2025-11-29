fun main(){

    val list = LinkedList<Int>()

    // Teste append
    list.append(1)
    list.append(2)
    list.append(3)
    println("Nach append:")
    list.printList()  // Erwartete Ausgabe: 1 -> 2 -> 3 -> null

    // Teste prepend
    list.prepend(0)
    println("Nach prepend:")
    list.printList()  // Erwartete Ausgabe: 0 -> 1 -> 2 -> 3 -> null

    // Teste removeFirst
    val first = list.removeFirst()
    println("Nach removeFirst (entferntes Element: $first):")
    list.printList()  // Erwartete Ausgabe: 1 -> 2 -> 3 -> null

    // Teste removeLast
    val last = list.removeLast()
    println("Nach removeLast (entferntes Element: $last):")
    list.printList()  // Erwartete Ausgabe: 1 -> 2 -> null

    // Teste search
    val searchResult = list.search(2)
    println("Suche nach 2: $searchResult")  // Erwartete Ausgabe: true

    val searchResult2 = list.search(3)
    println("Suche nach 3: $searchResult2")  // Erwartete Ausgabe: false

}

class Node<T>(val value: T, var next: Node<T>? = null)
class LinkedList<T>{
    private var head: Node<T>? = null

    fun append(value: T){
        val newNode = Node(value)

        if(head == null){
            head = newNode
        }else{
            var current = head
            while (current?.next != null){
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun removeLast() : T?{
        if (head == null) return null
        if (head?.next == null) {
            val value = head?.value
            head = null
            return value
        }

        var current = head
        while (current?.next?.next != null) {
            current = current.next
        }
        val value = current?.next?.value
        current?.next = null
        return value
    }

    fun prepend(value: T){
        val newNode = Node(value)
        newNode.next = head
        head = newNode
    }

    fun removeFirst() : T?{
        if(head == null) return null
        val value = head?.value
        head = head?.next
        return value
    }

    fun search(value: T):Boolean{
        var current = head
        while (current?.next != null){
            if (current == value) return true
            current = current.next
        }
        return false

    }

    fun printList(){
        var current = head
        while (current != null){
            print("${current.value} -> ")
            current = current.next
        }
        println("null")
    }
}
