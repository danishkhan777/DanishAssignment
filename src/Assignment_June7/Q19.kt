package Assignment_June7

fun main()
{
    var orderNo=1
    while(orderNo < 10)
    {
        if(orderNo == 5)
            break
        println("Please Have A Seat")
        orderNo++
    }
    if (orderNo < 6)
        println("Rush Hour ... Please Wait for Sometime")
}