package Assignment_June13

fun main() {
    try {
        val res = 20/0
        println(res)
    }
    catch (e:ArithmeticException) {
        println("Exception Occured ! Divided By Zero")
    }
}