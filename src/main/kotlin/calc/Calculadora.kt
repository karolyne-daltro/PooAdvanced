package calc

class Calculadora {

    /*Companion - Para quando tivermos a necessidade de ter um métodp ou
    atributo que possa ser chamado sem a necessidade de instanciarmos a
    um objeto da classe.
     */

    companion object{
        fun adicao(num1: Double, num2: Double){
            println("A soma de $num1 + $num2 é igual a ${num1 + num2}")
        }

        fun divisao(num1: Double, num2: Double){
            println("A soma de $num1 / $num2 é igual a ${num1 / num2}")
        }

        fun subtracao(num1: Double, num2: Double){
            println("A subtração de $num1 - $num2 é igual a ${num1 - num2}")
        }
    }
}