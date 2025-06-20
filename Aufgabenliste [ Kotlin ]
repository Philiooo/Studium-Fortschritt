import jdk.jshell.Snippet
import java.sql.Time
import javax.management.Descriptor
open class WorkUnit(val title: String, val description : String, var deadline : Int = 2,  var status : Status){
    internal fun changeStatus(newStatus: Status)  {
        this.status =  newStatus
    }
    open fun getSummary() : String{
        return "Die Aufgabe '$title' mit der Beschreibung '$description' " +
                "muss bis in $deadline Tagen erledigt sein. " +
                "Der aktuelle Status ist $status. "
    }
}
class Task (title : String, description : String, deadline : Int = 2 , status : Status,  var steps: MutableList<String>? = null, var estimatedTime: Int? = null ): WorkUnit(title, description, deadline, status){
    var changeStatus = changeStatus(status)
    val timeDescription = estimatedTime?.toString() ?: "Keine Zeit geschätzt"
    val stepsDescription = steps?.joinToString() ?: "Keine Arbeitsschritte"
    override fun getSummary() : String  {
        return  super.getSummary() + "Die Arbeitsschritte sind: ${stepsDescription}. " +
                "Es wird voraussichtlich $timeDescription Minuten dauern."
    }
    init {
        this.steps = steps ?: mutableListOf() // Wenn steps null ist, wird eine leere Liste zugewiesen
        this.estimatedTime = estimatedTime ?: 0 // Wenn estimatedTime null ist, wird 0 zugewiesen
    }

}
class Projekt ( title : String , description: String, deadline: Int = 2, var task : MutableList<Task>,  status : Status ): WorkUnit(title, description, deadline, status) {
    var progress: Double = 0.0
        get() {
            var completedTasksCount =
                task.count { it.status == Status.DONE } //verwendet, um die Anzahl der Aufgaben zu zählen, deren Status auf "DONE" ist
            val totalTasksCount = task.size
            if (totalTasksCount > 0) {
                return (completedTasksCount.toDouble() / totalTasksCount) * 100
            } else
                return 0.0

        }

    override fun getSummary(): String {
        return super.getSummary() + " Das Projekt beinhaltet ${task.size} Aufgaben. " +
                "Aktuell sind $progress % abgeschlossen."
    }

    private fun addTask(newTask: Task) {
        if (newTask.deadline <= this.deadline) {
            task.add(newTask)
        } else {
            throw DeadlineException("Die Deadline der Aufgabe liegt nach der Deadline des Projekts.")
        }
    }

    fun safeAddTask(newTask: Task) {
        addTask(newTask)
    }

    var statusChange = changeStatus(status)
    fun getTask(index: Int): Task? {
        return if (index in 0 until task.size) {
            task[index]
        } else {
            null
        }
    }

}

enum class Status{
    TODO,
    DOING,
    DONE;
}
class DeadlineException(message: String) : Exception(message)

fun main(){

    // Aufgaben erstellen
    val task1 = Task("Einkaufen", "Lebensmittel einkaufen", 5, Status.TODO, mutableListOf("Pfand einpacken", "Zum Supermarkt fahren", "Einkaufen", "Nach Hause fahren", "Einkäufe einräumen"), 90)
    val task2 = Task("Putzen", "Wohnung putzen", 3, Status.TODO, mutableListOf("Staubsaugen", "Wischen", "Müll rausbringen"), 60)
    val task3 = Task("Wäsche waschen", "Kleidung waschen", 7, Status.TODO, mutableListOf("Sortieren", "Waschmaschine beladen", "Trocknen", "Bügeln"), 120)
    val task4 = Task("Gartenarbeit", "Rasen mähen", 12, Status.TODO, null, 45) // Null-Wert für steps
    val task5 = Task("Wäsche waschen", "Kleidung waschen", 7, Status.TODO, mutableListOf("Sortieren", "Waschmaschine beladen", "Trocknen", "Bügeln"), null) // Keine geschätzte Zeit
    val task6 = Task("Gartenarbeit", "Rasen mähen", 12, Status.TODO, null, null) // Null-Werte für steps und estimatedTime

    // Projekt erstellen
    val project = Projekt("Hausarbeit", "Verschiedene Hausarbeiten erledigen", 10, mutableListOf<Task>(),Status.TODO)

    // Aufgaben zum Projekt hinzufügen
    project.safeAddTask(task1)
    project.safeAddTask(task2)
    project.safeAddTask(task3)

    // Status einiger Aufgaben ändern
    task1.changeStatus(Status.DONE)
    task2.changeStatus(Status.DOING)

    // Ausgabe der Zusammenfassungen
    println(task1.getSummary())
    println(task2.getSummary())
    println(task3.getSummary())
    println(project.getSummary())

    // Fortschritt des Projekts anzeigen
    println("Fortschritt des Projekts: ${project.progress}%")

    // Neue Aufgabe erstellen und hinzufügen
    val newTask = Task("Gartenarbeit", "Rasen mähen", 12, Status.TODO, mutableListOf("Rasenmäher holen", "Rasen mähen", "Rasenmäher sauber machen"), 45)
    try {
        project.safeAddTask(newTask)
    } catch (e: DeadlineException) {
        println("Fehler: ${e.message}")
    }

    // Status des Projekts ändern und Zusammenfassung ausgeben
    project.changeStatus(Status.DOING)
    println(project.getSummary())
}
