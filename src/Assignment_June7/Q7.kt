package Assignment_June7

fun main()
{
    println("Even-dollar coffee prices (from \$1 to \$10):")

    for (price in 1..10) {
        if (price % 2 == 0) {
            println("☕ $ $price")
        }
    }
}