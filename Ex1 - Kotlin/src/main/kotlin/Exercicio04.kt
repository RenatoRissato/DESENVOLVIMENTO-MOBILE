fun main() {
    var pessoa1 = Pessoas()
    var pessoa2 = Pessoas()

    // Carregar dados para a primeira pessoa
    carregaDados(pessoa1, "primeira")

    // Carregar dados para a segunda pessoa
    carregaDados(pessoa2, "segunda")

    // Impressão das pessoas
    println(pessoa1)
    println(pessoa2)
}

fun carregaDados(pessoa: Pessoas, texto: String) {
    // Declaração da variável entrada
    var entrada: String

    print("Digite o nome da $texto pessoa: ")
    entrada = readln()
    pessoa.nome = entrada

    println("Digite a idade da $texto pessoa: ")
    entrada = readln()
    pessoa.idade = entrada.toInt()

    println("Digite o peso da $texto pessoa: ")
    entrada = readln()
    pessoa.peso = entrada.toDouble()

    println("Digite a altura da $texto pessoa: ")
    entrada = readln()
    pessoa.altura = entrada.toDouble()
}

class Pessoas {
    var nome = ""
    var idade = 0
    var peso = 0.0
    var altura = 0.0

    fun mostrarNome(): String {
        return if (nome != "") nome else "Nome não cadastrado!"
    }

    fun mostrarIdade(): Int {
        return idade
    }

    fun mostrarPeso(): Double {
        return peso
    }

    fun mostrarAltura(): Double {
        return altura
    }

    fun calculaIMC(): Double {
        return peso / (altura * altura)
    }

    fun situacaoIMC(): String {
        val IMC = calculaIMC()
        return when {
            IMC < 18.5 -> "Abaixo do peso ideal"
            IMC < 25 -> "Peso normal"
            IMC < 30 -> "Acima do peso"
            IMC < 35 -> "Obesidade grau 1"
            IMC < 40 -> "Obesidade grau 2"
            else -> "Obesidade grau 3"
        }
    }

    // Correção do método toString() usando concatenação de strings
    override fun toString(): String {
        return "Nome: ${mostrarNome()}\n" +
                "Idade: ${mostrarIdade()}\n" +
                "Peso: ${mostrarPeso()}\n" +
                "Altura: ${mostrarAltura()}\n" +
                "IMC: ${calculaIMC()} - ${situacaoIMC()}\n"
    }
}
