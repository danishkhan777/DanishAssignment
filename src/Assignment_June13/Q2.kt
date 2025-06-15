package Assignment_June13

fun main()
{
    var fruits = mutableListOf("Banana","Mango","Muskmelon","Apple")
    fruits.removeAll {
        it.startsWith("M", ignoreCase = true)
    }
    println(fruits)
}