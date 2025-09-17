fun main() {

    val i: Int = 66345

    val b1 = i.toByte()

    println(i)
    println(b1)
    println("$i, $b1")

    val b2: Byte = 1
    println(b2)

    //these variables result in an error message because we are trying to assign
    //a byte variable to other types of variables
//    val i1: Int = b2
//    val i2: String = b2
//    val i3: Double = b2

    //This doesn't give an error because we are not declaring the type of the variable
    val i1 = b2

    //As for this scenario, we can circumvent the problem by casting the variable to the needed type
    val i4: Int = b2.toInt()
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    //Kotlin permits the free use of underscores for numerical variables with the objective of
    //making code more readable
    val i7 = 1_000_000
    println("One million = $i7")

    /*In Kotlin the two methods used for assigning data are with val and var which respectively
    represent constants and variables
     */
    val num1 = 5
    var num2 = 7

    num2 = 8

    //num1 = 6
    //'val' cannot be reassigned.

    /*Strings in Kotlin are a concatenation of characters. They are declared using " for strings
    and ' for single characters. Just like other programming languages you can use string interpolation
    by typing $ followed by a Kotlin expression
     */

    val games = 22
    val consoles = 3

    println("I have $consoles consoles and $games games")
    println("I have ${games+consoles} consoles and games")
}