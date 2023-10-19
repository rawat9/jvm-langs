package lab02

class PersonHandler {
    private val persons = mutableListOf<Person>()

    fun createPerson(name: String, age: Int = 0, height: Double = 0.0, weight: Int = 0, email: String = ""): Person {
        return Person(name, age, height, weight, email)
    }

    fun addToList(person: Person) {
        persons.add(person)
    }

    fun getHeightInInches(height: Double): Double {
        return heightInInches(height)
    }
}

fun PersonHandler.heightInInches(height: Double): Double {
    return height / 2.54
}