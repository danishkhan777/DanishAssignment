package Assignment_June8

fun main()
{
   var s = Sum()
   println(s)
}
fun Sum():String
{
    println("Enter The Value of X And Y")
    var x = readln().toInt()
    var y = readln().toInt()
    var z = x + y
    var str="The Sum of $x and $y is $z"
    return str
}