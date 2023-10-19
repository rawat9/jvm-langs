package lab02

data class Person(
    val name: String,
    val age: Int,
    val height: Double = 0.0,
    val weight: Int = 0,
    val email: String? = null
) {
    private var userName: String
    private var password = ""

    init {
        userName = this.name + (1..100).random()
        password = (1..10).shuffled().take(5).toString()
    }

    init {
        println("Init block 2")
    }

    init {
        println("Init block 3")
    }
}
