package Assignment_June8

fun main()
{
    var stdInfo = mapOf("Danish" to 90, "Yash" to 80,"Asish" to 76,"Anu" to 70, "Rutu" to 85,"Sachit" to 65)
    stdInfo.forEach {
        (name,mark)
        -> if(mark > 75)
            println(name)
    }
    println("These Are The Students Who Have Scored Above 75")
}