open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")

    }
    open fun roam() {
       println ("The Animal is roaming")
    }

    fun asleep(){
        println ("The Animal is sleeping")
    }
}
class Hippo : Animal () {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise(){
        println ("Grunt!Grunt!")
    }
    override fun eat() {
        println ("The Hippo is eating $food")
    }
}
open class Canine : Animal () {
    override fun roam() {
        println("The canine is roaming")
    }
}

class Wolf : Canine () {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println ("Hooowl")
    }

    override fun eat () {
        println ("The wolf is eating smth")
    }
}
class Vet {
    fun giveShot(animal : Animal) {
        animal.makeNoise()
    }
}
fun main (args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

}

