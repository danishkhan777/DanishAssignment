package Assignment_June7

fun main() {
    print("Enter caffeine level (0-100): ")
    val level = readln().toInt()

    println(when (level) {
        in 0..30 -> " Mild: "
        in 31..70 -> " Medium: "
        in 71..100 -> " Strong: "
        else -> " Error: Caffeine overload detected!"
    })
}