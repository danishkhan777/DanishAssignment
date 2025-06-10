package Assignment_June10

fun main()
{
    val ob = personDet("Danish Khan",22)
    ob.runtime()
    val ob2 = personAge("Danish Khan")
    ob2.defaultAge()
}
class personDet(val name:String , val age: Int)
{
    fun runtime()
    {
        println("Hey $name Your Age Is $age")
    }
}
class personAge(val name: String , val age: Int = 20)
{
    fun defaultAge()
    {
        println("Hey $name Your Age Is $age")
    }
}