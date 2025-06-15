package Assignment_June13

fun validateAge(age: Int) {
    if (age < 18) {
        throw IllegalArgumentException("You Cannot Vote")
    }
}
fun main() {
    val age = 15
    try {
        validateAge(age)
    }
    catch (e: IllegalArgumentException) {
        println(e)
    }
}