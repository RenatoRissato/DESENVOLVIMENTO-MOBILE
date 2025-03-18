fun main (){

    var soma = 0
    var qtde = 0
    var maior = 0
    var menor = 999
    var somapar = 0
    var qtdepar = 0

    var entrada = " "
    var valor = 1
    while(valor != 0) {
        println("Digite um número: ")
        entrada = readln()
        valor = entrada.toInt()
        if (valor != 0) {
            soma += valor
            qtde++

            if (valor > maior)
                maior = valor
            if (valor < menor)
                menor = valor
            if (valor % 2 == 0) {
                somapar += valor
                qtdepar++
            }
        }
    }
    println("A soma dos numeros digitados é $soma")
    println("A quantidade de numeros digitados é $qtde")
    println("A média é ${media(soma, qtde)}")
    println("O maior número é $maior")
    println("O menor número é $menor")
    println("A média dos números pares é ${media(somapar, qtdepar)}")
    println("A média dos números impares é ${qtde - qtdepar}")
}
fun media(valor: Int, quantidade: Int):Double{
    val med = valor * 1.0/quantidade
    return med
}