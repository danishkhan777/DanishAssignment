package Assignment_June13

fun calculate(a :Int, operation: (Int)->Int):Int {
    return operation(a)
}
fun main() {
    val s = calculate(5){x -> x*x}
    println(s)
}