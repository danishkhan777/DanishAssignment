package Assignment_June10

fun main()
{
    var l = getLength("Danish")
    println(l)
}
fun getLength(input : String?):Int
{
    var len = input?.length?:0
    return len
}