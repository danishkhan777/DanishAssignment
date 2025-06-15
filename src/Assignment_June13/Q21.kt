package Assignment_June13

fun main() {
    try {
        val str = "abc"
        val num = str.toInt()
    } catch (e: NumberFormatException) {
        println("Invalid number format")
    }
}