package Assignment_June13

fun main() {
    var items = mapOf("Earbuds" to 2000, "Mouse" to 500, "Keyboard" to 800, "Glass" to 300)
    println("The Items having price greater than 500 are :")
    for((key,value) in items) {
        if( value > 500)
            println(key)
    }
}