package Assignment_June7

fun main() {
    println("Coffee countdown starting now! ☕↓")

    for (cups in 5 downTo 1) {
        when (cups) {
            5 ->println("FIVE cups left? That’s a serious caffeine adventure!")
            4 -> println("FOUR to go... You’re still a coffee champion.")
            3 -> println("THREE cups remaining. The magic number for productivity!")
            2 -> println("TWO left? Now we’re getting serious. Almost there!")
            1 -> println("ONE final cup! Make it count (or make it a double).")
            else -> println("Invalid Input ")
        }
    }
}