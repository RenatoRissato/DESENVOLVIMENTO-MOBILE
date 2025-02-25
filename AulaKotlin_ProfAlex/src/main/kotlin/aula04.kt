import kotlin.math.sqrt

fun main(){
    print("Digite o lado A: ")
    val ladoa: String = readln()
    print("Digite o lado B: ")
    val ladob: String = readln()
    print("Digite o lado c: ")
    val ladoc: String = readln()

    val tri: Triangulo = Triangulo()

    tri.a = ladoa.toDouble()
    tri.b = ladob.toDouble()
    tri.c = ladoc.toDouble()

    val tri2: Triangulo = Triangulo(ladoa.toDouble(), ladob.toDouble(), ladoc.toDouble())
    println("A área do triangulo é ${tri.area()}")
}


class Triangulo(){
    var a = 0.0
    var b = 0.0
    var c = 0.0

    init{
        println("O objeto foi instanciado!" +
                "" +
                "")
    }
    constructor( ladoa: Double, ladob: Double, ladoc: Double) : this(ladoa) {
        b = ladob
        c = ladoc

    }
    constructor(ladoa: Double): this(){
        a = ladoa
        b = ladoa
        c = ladoa
    }
    fun area(): Double{
        val p = (a + b+ c)/2

        return sqrt( p * (p-a) * (p-b) * (p-c))

    }
}

    class Pessoa{
        var nome: String = ""
        private var peso: Double = 0.0

        fun setpeso( p: Double){
            if( p > 0)
                peso = p
        }
        fun getpeso(): Double{
        return peso
        }

        var peso2: Double = 0.0
            set(value){
                if (value > 0)
                    field = value
            }
            get(){
                return field
            }
        var peso3: Double = 0.0
            private set
    }