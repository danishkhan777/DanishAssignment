package Assignment_June10

fun main()
{
    val ob = person("Danish Khan",22)
    ob.runtime()
}
class person(val name:String , val age: Int)
{
    fun runtime()
    {
        println("Hey $name Your Age Is $age")
    }
}