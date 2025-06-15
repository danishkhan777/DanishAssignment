package Assignment_June13

fun main()
{
    var names = listOf("Danish","Ruturaj","Yash", "Sam","Prit","Latham")
    var i=0
    for (item in names)
    {
        if(item.length > 5)
            i++
    }
    println("The Names Having More Than 5 Characters Are : $i")
}