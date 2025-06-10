package Assignment_June10

fun main()
{
    var age:Any? = "22"
    var num =age as? Int
    println(num)
    var number =age as? Int?: 23
    println(number)
}