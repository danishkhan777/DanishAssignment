package Assignment_June8

fun main()
{
    var intList = mutableListOf(1,2,3,4,5)
    var sqrList = mutableListOf<Int> ()
    for(item in intList)
    {
        var sq= item * item
        sqrList.add(sq)
    }
    println(sqrList)
}