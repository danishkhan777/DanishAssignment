package Assignment_June13

val checkPal: (String) -> Boolean = { str ->
    str.equals(str.reversed())
}
fun main()
{
    var s = checkPal("MADAM")
    if (s== true)
        println("String Is Palindrome")
    else
        println("String Is Not Palindrome")
}