import Constants.Companion.RED

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