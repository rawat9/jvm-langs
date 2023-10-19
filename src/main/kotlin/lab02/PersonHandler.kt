package lab02

class PersonHandler {
    fun createPerson(name: String, age: Int = 0, height: Double = 0.0, weight: Int = 0, email: String = ""): Person {
        return Person(name, age, height, weight, email)
    }

    fun getHeightInInches(height: Double): Double {
        return heightInInches(height);
    }
}

fun PersonHandler.heightInInches(height: Double): Double {
    return height / 2.54;
}