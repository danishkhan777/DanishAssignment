package Assignment_June13

fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println("Sum: ${operateOnNumbers(5, 3, sum)}")

    val product = { x: Int, y: Int -> x * y }
    println("Product: ${operateOnNumbers(5, 3, product)}")

    val difference = { x: Int, y: Int -> x - y }
    println("Difference: ${operateOnNumbers(5, 3, difference)}")
}