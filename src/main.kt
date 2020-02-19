import Constants.Companion.RED
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    // var can be edit
    // val can't be edit
    // nullValue, use ? after type

    println("This is a stringValue: ${stringValues()}")
    println("This is a stringBuilder: ${testStringBuilder()}")
    println("This is a companionObject: ${companionObject()}")
    println("This is reusableCode without last param: ${reusableCode(1.2, 2.5)}")
    println("This is reusableCode with last param: ${reusableCode(1.2, 2.5, "-")}")
    println("This is reusableCode with vararg: ${addValues(1, 2, 3, 4, 5, 6)}")
    print("Inter a city: ")
    val city = readLine()
    println(evaluateConditions(city))
    println("This is a iterationCollection: ${iterateCollection()}")
    println("This is doWhile: ${doWhile()}")
    println("This is tryCatch: ")
    tryCatch()
    println("This is a data class: ")
    dataClass()
}

fun stringValues(): List<Char> {
    val aString = "Hello!"

    val charArray = aString.toCharArray()
    return charArray.toList()
}

fun testStringBuilder(): StringBuilder {
    val builder = StringBuilder("Test.\n")
    builder.append("More testing.")
    return builder
}

fun companionObject(): String {
    return RED
}

fun reusableCode(param1: Double, param2: Double, operation: String = "+"): Double {
    if(operation.equals("+")) return param1 + param2
    else if(operation.equals("-")) return param1 - param2
    else return -1.0
}

fun addValues(vararg numbers: Int): String {
    var result = 0
    var resultNumbers = ""

    for (i in numbers) {
        result += i
        resultNumbers += "${i} "
    }
    return "$resultNumbers= $result"
}

fun evaluateConditions(input: String?): String {
//    if(input == "o") return "Odense"
//    else if(input == "k") return "københavn"
//    return "i don't know the city"

    val city = when(input) {
        "o" -> "Odense"
        "k" -> "København"
        else -> "Unknown"
    }
    return city
}

fun iterateCollection(): String {
    val colors = arrayOf("Test1", "Test2", "Test3")
    var result = ""

    for (color in colors) {
        result += "$color "
    }

    return result
}

fun doWhile(): String {
    val states = arrayOf("CA", "OR", "WA")
    var result = ""

    var index = 0
    do {
        result += "${states.get(index)} "
        index++
    } while (index < states.size)

    return result
}

fun tryCatch() {
    try {
        print("Value: ")
        val value = readLine()
        val valueDouble = value!!.toDouble()

        println(valueDouble * 2)
    } catch (e: KotlinNullPointerException) {
        println("Value was null")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    }
}

fun dataClass() {
    var clothingItem = ClothingItem("L", 19.99)
    println(clothingItem)
    println(clothingItem.type)

    clothingItem.type = "Shirt"
    println(clothingItem.type)
}