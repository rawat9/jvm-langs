abstract class Persistance {

    companion object {
        fun createDBPersistance() = DBPersistance()

        fun createFilePersistance() = FilePersistance()
    }

    abstract infix fun <T> save(data: T): Unit
}

class DBPersistance : Persistance() {
    override fun <String> save(data: String) {
        println("Saving ${data} to DB")
    }
}

class FilePersistance : Persistance() {
    override fun <Int> save(data: Int) {
        println("Saving ${data} to file")
    }
}
