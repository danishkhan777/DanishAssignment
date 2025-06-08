package Assignment_June7

fun main()
{
    val CoffeeTemp= 90
    val category = when{
        CoffeeTemp < 40 -> "Too Cold"
        CoffeeTemp in 41..60 -> "Perfect"
        else -> "Too Hot"
    }
    println("Your Coffee Is In The $category Range In Terms Of The Temperature")
}