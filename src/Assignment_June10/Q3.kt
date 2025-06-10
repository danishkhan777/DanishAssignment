package Assignment_June10
fun main()
{
    var name:String = "Danish"
    name?.let {
        println("The UpperCase Version of $name is ${it.uppercase()}")
    }
}