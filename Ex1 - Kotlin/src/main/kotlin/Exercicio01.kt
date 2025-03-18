fun main(){
    var saida = " "
    print("Digite um texto: ")
    val entrada = readln()
    for(ch in entrada){
        saida = ch + saida
    }
    println(saida)
}