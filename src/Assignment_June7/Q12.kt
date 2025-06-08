package Assignment_June7

fun main()
{
    println("Enter The Coffee Price : ")
    var price = readln().toInt()
    val range = when (price)
    {
        in 0..30 -> " LOW !! Too less than Expected , Isn't it ?"
        in 31..70 -> " MEDIUM !! Works For me But You Should Try The Higher !"
        in 71..100 -> " HIGH !! Fortune Favours The Brave !! GO for It !! "
        else -> "Run"
    }
    println(range)
}