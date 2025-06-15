package Assignment_June13

fun Operations(data: List<Int>?, index: Int, divisor: Int) {
    try {
        val list =data!!
        val value = list[index]
        val result = value / divisor

        println("Result: $result")

    } catch (e: NullPointerException) {
        println("Error: List is null!")
    } catch (e: IndexOutOfBoundsException) {
        println("Error: Index $index is invalid ")
    } catch (e: ArithmeticException) {
        println("Error: Division by zero!")
    } catch (e: Exception) {
        println("Exception Occured :")
    }
}

fun main() {
    val numbers = listOf(10, 20, 30)
    Operations(null, 0, 5)
    Operations(numbers, 5, 2)
    Operations(numbers, 0, 0)
}