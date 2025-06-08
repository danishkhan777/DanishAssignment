package Assignment_June7

fun main()
{
    var CupSize1 = "Small"
    var CupSize2 = "Large"
    println("The Cup Sizes Are Small Cup - $CupSize1 and Large Cup - $CupSize2")
    var temp=CupSize1
    CupSize1 = CupSize2
    CupSize2 = temp
    println("The Cup Sizes Are Small Cup - $CupSize1 and Large Cup - $CupSize2")
}