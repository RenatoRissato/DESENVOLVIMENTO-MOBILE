fun main(){

    var arroz: Produtos = Produtos()
    var feijao: Produtos = Produtos()

    print("Digite o preço do arroz: ")
    var entrada: String = readln()
    arroz.setPreco(entrada.toDouble())

    print("Digite o preço do feijão: ")
    entrada = readln()
    feijao.setPreco(entrada.toDouble())

    println("O preço do arroz é: R$ ${String.format("%.2f", arroz.getPreco())}")
    println("O preço do feijão é: R$ ${String.format("%.2f", feijao.getPreco())}")
    
}

class Produtos {
    var codigo = 0
    var nome: String = ""
    var quantidade: Int = 0
    private var preço: Double = 0.0

    fun setPreco(p:Double){
        preço = p
    }

    fun getPreco(): Double{
        return preço
    }

}