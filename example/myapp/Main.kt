package example.myapp
fun buildAquarium() {
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()
//    secondary constructor
//    val aquarium6 = Aquarium(numberOfFish = 29)
//    aquarium6.printSize()
//    aquarium6.volume = 70
//    aquarium6.printSize()
    //open class
//    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
//    aquarium7.printSize()
    //towerTank
    val myAquarium8 = Aquarium(width = 24, length = 24, height = 40)
    myAquarium8.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
//    buildAquarium()
    makeFish()
}