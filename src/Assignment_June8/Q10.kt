package Assignment_June8

fun main()
{
    LongestStr()
}
fun LongestStr() {
    var max = 0
    var wordList = listOf("Danish", "Khan", "Hungry", "Honesty","Develpoment","Telephone")
    for (item in wordList)
    {
        if(item.length >max)
            max=item.length
    }
    for (item in wordList)
    {
        if(item.length == max)
            println(item)
    }
}