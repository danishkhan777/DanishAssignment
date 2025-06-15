package Assignment_June13

fun checkList( s:List<Int>) {
    if (s.isEmpty())
        throw IllegalArgumentException("The List Cannot be Empty")
}
fun main()
{
    var nums = listOf<Int>()
    try{
        checkList(nums)
    }
    catch (e:IllegalArgumentException) {
        println(e)
    }
}