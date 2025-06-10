package Assignment_June10

fun main()
{
    var nullableEmail: String? = "danishkhan77@gmail.com"
    nullableEmail = null
    var msg = nullableEmail?: "No Email Provided !"
    println(msg)
}