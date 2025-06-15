package Assignment_June13

fun main() {
    var strlist = listOf("Danish","Ruturaj","Yash", "Sam","Prit","Latham")
    var lenlist = mutableListOf<Int>()
    for (item in strlist) {
        var len =item.length
        lenlist.add(len)
    }
    println(lenlist)
}