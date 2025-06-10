package Assignment_June8

fun main()
{
    var str: String? = "ABCD"
    if(str == null)
        println("The String is Missing")
    else {
        val s = str?: "XYZ"
        val rev =s.reversed()
        println("The Reverse Of The String is $rev")
    }
}