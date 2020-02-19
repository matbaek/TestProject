class MathLib {
    companion object {
        fun getInput(input: String): Double {
            print(input)
            val input = readLine()
            val inputDouble = input!!.toDouble()
            return inputDouble
        }

        fun addValues(number1: Double, number2: Double) = number1 + number2
        fun subtractValues(number1: Double, number2: Double) = number1 - number2
        fun divideValues(number1: Double, number2: Double) = number1 / number2
        fun multiplyValues(number1: Double, number2: Double) = number1 * number2
    }
}