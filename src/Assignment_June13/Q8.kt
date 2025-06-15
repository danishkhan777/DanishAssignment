package Assignment_June13

fun main() {
    var str = "Android Development Using Jetpack Compose"
    var vowels = mutableSetOf<Char>()
    var c =0
    while (c < str.length)
    {
        var i = str.get(c)
        if(i=='a' || i=='e' || i=='o' || i=='i' || i=='u' || i=='A' || i=='E' || i=='O' || i=='I' || i=='U')
            vowels.add(i)
        c++
    }
    println(vowels)
}