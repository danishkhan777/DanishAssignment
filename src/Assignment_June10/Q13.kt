package Assignment_June10

data class User(val name:String,val email:String)
fun main()
{
    val user1 =User("Danish Khan","danishkhan77@gmail.com")
    val user2 =User("Ruturaj Barik","ruturaj9577@gmail.com")
    println(user1==user2)
}