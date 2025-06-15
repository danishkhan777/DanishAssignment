package Assignment_June13

fun checkString( s:String) {
    if(s.equals(""))
        throw IllegalArgumentException("The String Cannot be Empty")
}
fun main() {
    var str =""
    try {
        checkString(str)
    }
    catch (e:IllegalArgumentException) {
        println(e)
    }
}