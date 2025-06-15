package Interview

fun main() {
    var s="10.0.1.250"
    var res = checkIP(s)
    if (res == 1)
        println("$s Is A Valid IP Address")
    else
        println("$s Is Not " +
                "A Valid IP Address")
}
fun checkIP(str:String):Int {
    var strlist = str.split(".")
    val first = strlist[0].toInt()
    if (first == 0)
        return 0
    else {
        var i = 0
        for (item in strlist) {
            var num = item.toInt()
            if (num > 256)
                break
            else {
                i++
                continue
            }
        }
        if (i == 4)
            return 1
        else
            return 0
    }

}