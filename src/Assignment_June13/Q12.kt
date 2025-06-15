package Assignment_June13

fun main() {
    var numbers = listOf(1,2,3,4,5,6,7,8,9)
    var sqlist = numbers.map { it * it }
    println("The Square of All The Numbers OF The List are")
    println(sqlist)
}