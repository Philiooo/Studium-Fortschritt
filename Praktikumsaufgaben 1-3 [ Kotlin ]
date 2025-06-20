import java.lang.IllegalArgumentException

fun main(){

    val task1 = Task("Einkaufen", "Alle benötigten Lebensmittel kaufen", 4, mutableListOf("Pfand einpacken", "Zum Supermarkt gehen", "Einkaufen", "Nach Hause fahren", "Einkäufe einräumen"), 7, Status.DOING)
    val task2 = Task("Hausaufgaben", "Alle Hausaufgaben bearbeiten", 4, mutableListOf("AP2", "Mathe"), 5, Status.DOING)
    val task3 = Task("Sport", "Oberkörperworkout", 6, mutableListOf("Brust", "Bizep", "Trizep", "Schulter"), 11, Status.DONE)


    val project = Project("Projekt A","Projekt A description", 7, listOf(task1, task2, task3))

    println("Fortschritt des Projekts: ${project.progress}%")

    println(task1.getSummery())
    println(task2.getSummery())
    println(task3.getSummery())
    println(project.getSummery())
}


enum class Status{
    TODO,
    DOING,
    DONE
}

enum class Priority {
    HIGH,
    MEDIUM,
    LOW;

    companion object {
        fun fromFactor(factor: Double): Priority {
            return when (factor.toInt()) {
                1 -> HIGH
                2 -> MEDIUM
                3 -> LOW
                else -> throw IllegalArgumentException("Ungültiger Faktor: ${factor}")
            }
        }
    }
}

interface Prioritizable{
    fun prioritize():Double
}

open class WorkUnit(val title: String,
                    val description: String,
                    var deadline: Int,
                    var status: Status
):Prioritizable{
    open fun changeStatus(Status: Status){
        this.status = Status
    }

    open fun getSummery():String = "$title mit der Beschreibung $description sollte in $deadline Tagen erledigt sein. "

    override fun prioritize(): Double {
        val returnVal = if (deadline < 7) 1.0 else if (deadline < 31) 2.0 else 3.0
        this.status = if (returnVal == 1.0) Status.DOING else if (returnVal == 2.0) Status.TODO else Status.DONE
        return returnVal
    }

    var priority: Priority? = null
        get() = Priority.fromFactor(this.prioritize())

}

open class Task(
    title:String,
    description:String,
    deadline:Int,
    var steps: List<String> = mutableListOf(),
    var estimatedTime: Long = 0,
    status: Status = Status.TODO

):WorkUnit(title, description, deadline, status){

    override fun changeStatus(Status: Status){
        this.status = Status
    }

    override fun getSummery(): String = "Die Aufgabe " + super.getSummery() + " Die Arbeitsschritte beinhalten $steps"



}

class Project(title:String,
              description:String,
              deadline:Int,
              var tasks:List<Task>,
              status: Status = Status.TODO

):WorkUnit(title, description, deadline, status){

    val progress : Int
        get() {
            if(tasks.isEmpty()){
                return 0
            }
            val doneTasks = tasks.count{it.status == Status.DONE}
            return (doneTasks *100)/tasks.size

    }
    override fun changeStatus(Status: Status) {
        if (Status != null) {
            this.status = Status
        }
    }

    override fun getSummery():String = "Das Projekt " + super.getSummery() + " Es enthält ${tasks.size} Aufgaben"

//    fun addTask(task: Task) {
//        if (task.deadline < 0) {
//           throw Exception("Die Deadline wurde schon überschritten")
//        }
//        tasks.add(task)

    fun checkTasks(){
        for(t in tasks){
            if(t is SingleTask) {
                if (t.reminder <= 0) {
                    println("Alarm für einmalige Aufgabe ’${t.title}’!")
                }
            }   else if(t is RecurringTask){
                if(t.deadline < 0){
                    t.deadline += t.frequency+1
                    println("Wiederkehrende Aufgabe ’${t.title}’ ist überfällig und wird neu geplant. \nNeue Deadline für ’${t.title}’ in ${t.deadline} Tagen")
                }
            }
        }
    }
}
class SingleTask(title : String, description: String, deadline: Int, steps: List<String>, estimatedTime: Long,
                 status: Status) : Task(title, description, deadline, steps, estimatedTime, status){
    var reminder : Int = 2
        get() {
            if (field < 0){
                field = 0
            }
            return field
        }
}


class RecurringTask(title: String, description: String, deadline: Int, steps: List<String>, estimatedTime: Long,
                    status: Status, var frequency : Int) : Task(title, description, deadline, steps, estimatedTime, status){

}
class DependencyList<T> {
    data class Node<T>(val data: T, var next: Node<T>?) {

        private var first: Node<T>? = null

//        fun addLast(task: Task) {
//            val newNode = Node(task)
//            if (first == null) {
//                first = newNode
//            } else {
//                var current = first
//                while (current?.next != null) {
//                    current = current.next
//                }
//                current?.next = newNode
//            }
//        }

        fun getAndRemoveFirst(): Task? {
            val removed = first
            if (first != null){
                first = first?.next
            }
            return removed?.data as? Task
        }

        fun search(title: String): Node<T>? {
            var current = first
            while (current != null) {
                if ((current.data as Task).title == title) {
                    return current
                }
                current = current?.next
            }
            return null
        }

        fun insertSorted(task: Task) {
            
        }
    }
}
