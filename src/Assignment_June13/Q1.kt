package Assignment_June13

fun main()
{
    var numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    for (item in numbers)
    {
        if (item % 2 ==0)
            println(item)
    }
}