package example.myapp.decor
////data class
//data class Decoration(val rocks: String) {
//}
////enum class
//enum class Color(val rgb: Int) {
//    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
//}
//enum class Direction(val degrees: Int) {
//    NORTH(0), SOUTH(180), EAST(90), WEST(270)
//}
//
////fun call data class
//fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//    //so sánh giá trị
//    println (decoration1.equals(decoration2))
//    println (decoration3.equals(decoration2))
//}
class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}

fun main(){
//    makeDecorations()
    //enum class
//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)
//companion object
//    println(Choice.name)
//    Choice.showDescription("pick")
//    Choice.showDescription("selection")
    //pair and triple
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")
//    val numbers = Triple(6, 9, 42)
//    println(numbers.toString())
//    println(numbers.toList())
//    val equipment2 = ("fish net" to "catching fish") to "equipment"
//    println("${equipment2.first} is ${equipment2.second}\n")
//    println("${equipment2.first.second}")
//    ///Destructure some pairs and triples
//    val equipment = "fish net" to "catching fish"
//    val (tool, use) = equipment
//    println("$tool is used for $use")
//    val numbers = Triple(6, 9, 42)
//    val (n1, n2, n3) = numbers
//    println("$n1 $n2 $n3")
//    //list
//    val list2 = listOf("a", "bbb", "cc")
//    for (s in list2.listIterator()) {
//        println("$s ")
//    }
//    //hash map
//    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
//    println (scientific.get("guppy"))
//    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))

}
