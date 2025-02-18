fun main() {
    var num1: String
    var num2: String
    var continua: String
    var resultado: Int

    do {
        print("Digite o primeiro numero: ")
        num1 = readln()
        print("Digite o segundo numero: ")
        num2 = readln()

        try {
            resultado = num1.toInt() / num2.toInt()
            println("A divisão de $num1 por $num2 é $resultado")
        } catch (e: ArithmeticException) {
            println("Impossivel dividir por zero!")

        } catch (e: NumberFormatException){
            println("Por favor, informar um número válido!")
        }
        print("fazer outra conta (s/n)?")
        continua = readln()
    }while (continua == "s")

}



