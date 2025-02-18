fun main() {
    val b = 8
    val a = 2

        try {
            println( b / a)
        }
        catch (e: ArithmeticException){
            println("Impossível dividir por zero")
        }

}