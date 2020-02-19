import java.lang.Exception
import java.lang.NumberFormatException
import Operation.*

fun main(args: Array<String>) {
    try {
        val numberOne = MathLib.getInput("Number 1: ")
        val numberTwo = MathLib.getInput("Number 1: ")

        print("Select an operation ${ADD.operation} ${SUBTRACT.operation} ${DIVIDE.operation} ${MuLTIPLY.operation}: ")

        val result = when(readLine()) {
            ADD.operation -> MathLib.addValues(numberOne, numberTwo)
            SUBTRACT.operation -> MathLib.subtractValues(numberOne, numberTwo)
            DIVIDE.operation -> MathLib.divideValues(numberOne, numberTwo)
            MuLTIPLY.operation -> MathLib.multiplyValues(numberOne, numberTwo)
            else -> "Operation is not accepted!"
        }

        println("The answer is $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}