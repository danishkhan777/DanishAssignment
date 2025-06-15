package Assignment_June13

fun main() {
    val list1 = listOf(1, 2, 3, 3, 4, 5)
    val list2 = listOf(4, 5, 6, 7, 8, 9, 7, 10)

    val mergedList = (list1 + list2).toSet()
    println("The List After Merging And Removing The Duplictaes is :")
    println(mergedList)
}