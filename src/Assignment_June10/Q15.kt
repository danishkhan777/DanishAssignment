package Assignment_June10

class MathUtils
{
    companion object
    {
        fun square(n:Int):Int
        {
            return n * n
        }
    }
}
fun main()
{
    var sq = MathUtils.square(5)
    println("The Square Of The Number is $sq")
}