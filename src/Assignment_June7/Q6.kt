package Assignment_June7

fun main()
{
    print("Enter a day number (1-7, where 1=Monday): ")
    val dayNum = readln().toInt()

    when (dayNum) {
        1 -> println("Double Espresso")
        2 -> println("Cappuccino")
        3 -> println("Cold Brew")
        4 -> println("Flat White")
        5 ->println( "Iced Latte")
        6 -> println(" Hot Latte")
        7 ->println( "Decaf Herbal Tea")
        else -> println("Invalid Day Number")
    }
}