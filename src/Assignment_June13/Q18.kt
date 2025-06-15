package Assignment_June13

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val taken = numbers.takeWhile { it <= 5 }
    println("takeWhile { ≤5 }: $taken")

    val dropped = numbers.dropWhile { it <= 5 }
    println("dropWhile { ≤5 }: $dropped")
}