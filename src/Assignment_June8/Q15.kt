package Assignment_June8

fun main()
{
    var nullableStr1:String? = "Kotlin"
    var nullableStr2:String? = "Android"
    nullableStr2 = null
     val len =nullableStr1?.length //returns the length of the string if the value is not null else returns null
    var forcedUnwrap = nullableStr1!! // performs The Forced Unwrap using !!
    var safeUnwrap = nullableStr2?: "Danish" //peforms The Safe Unwrap using ?: And gives a default value "Danish" if the value is found to be NULL
    println(len) // gives 6 as output
    println(forcedUnwrap) //gives Kotlin as output
    println(safeUnwrap) //gives Danish as output
}