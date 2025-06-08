package Assignment_June7

fun main()
{
    val Ogprice = 100
    for(discount in 10..50 step 10)
    {
        var disprice=Ogprice * (1-discount/100.0)
        println("At $discount % off , The Coffee costs Rs $disprice")
    }
}