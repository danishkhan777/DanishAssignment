package Assignment_June8

fun main()
{
    var str:String? = "123"
    var intval = str?.toIntOrNull()
    val res = (intval?:0) * 2
    println(res)
}