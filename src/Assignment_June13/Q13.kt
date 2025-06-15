package Assignment_June13

fun main() {
    var numbers = listOf(10,20,30,40,50,60,70,80,90,100)
    var grt = numbers.filter { it > 50 }
    println(grt)
}