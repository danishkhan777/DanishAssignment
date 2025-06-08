package Assignment_June7

fun main()
{
    var i=1
    for (i in 1..10)
    {
        println("Enter The Order Name")
        var ordername= readln()
        if(ordername.equals("Decaf",ignoreCase=true))
        {
            println("Not Acceptin The Decaf Orders Foe Now , Sorry For The Inconvenience Caused!!")
            continue
        }
        println("Please Wait Till We Prepare Your Order")
    }
}