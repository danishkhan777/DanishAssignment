package Assignment_June10

open class Animal {
    open fun makeSound() {
        println("The Animal Makes a Sound")
    }
}
class Dog : Animal() {
    override fun makeSound() {
        println("The Dog Barks")
    }
}
fun main() {
    val animal = Animal()
    animal.makeSound()

    val dog = Dog()
    dog.makeSound()
}