package Assignment_June7

fun main()
{
    val randomtip = (1..4).random()
    val tip = when(randomtip)
    {
        1 -> "A Coffee A Day Keeps The Sleep Away , But Not Fopr Long !!"
        2 -> "Coffee Favours The Brave"
        3 -> "When In Doubt , Have Coffee"
        4 -> "Drink Coffee Do Nothing "
        else -> "Looks Like Someone Doesnot Understand The Word RANDOM"
    }
    println(tip)
}