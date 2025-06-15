package Assignment_June13

fun CheckAge(age: Int) {
    if (age < 0) {
        throw IllegalArgumentException("Invalid Age")
    }
}
fun main() {
    val age = -20
    try {
        CheckAge(age)
    }
    catch (e: IllegalArgumentException) {
        println(e)
    }
}