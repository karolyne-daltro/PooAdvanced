import Cliente.Cliente
import `object`.Estoque
import encap.Estudante

fun main() {

    /*
    Campamiom Object - Atributos e métodos sem precisar instanciar uma classe.
    Objetos Anônimos - São objetos que só são instanciados uma única vez.
    Encapsulamento - Deixar os nossos dados protegidos.
    Exceção - Soltar exceções personalizadas e tratar essas exceções.
     */

    /*val calc = calc.Calculadora() */

    //Exemplo utilizando métodos do companion object
    /*calc.Calculadora.adicao(50.0, 50.0)
    calc.Calculadora.divisao(20.0, 20.0)
    calc.Calculadora.subtracao(60.0, 60.0)*/

    //Exemplo utilizando objetos anônimos
    /* Estoque.addLista("Tesco")*/

    /*
    Encapsulamento - Uso de algumas palavras reservadas para proteger tanto
    atributos quanto métodos.

    Default - Nemhum dos dados da classe são protegidos, ou seja, todo mundo do mesmo pacote
    pode acessar os métodos e atributos da classe.

    Public - Deixa todos os métodos e atributos públicos para qualquer classe acessar
    (indeoendente do pacote)

    Private - Deixa os métodos e atributos de uma classe privados, ou seja, só
    podem ser acessados denro dela.

    Protected - Deixa os métodos e atributos de uma classe para só poderem ser acessados pela
    classe em si e pelas classes filhas.
     */

    /*val brookly = Estudante("Brookly", ra: 123)

    brookly.alterarNota(valor: 6.0)*/

    /*Cria uma Classe Cliente, contendo os atributos encapsulados, um
    construtor padrão e pelo menos mais duas opções de construtores conforme
    sua percepção, com os atributos: nome (String), endereço (String), telefone
    (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do
    atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja
    vazio, jogue uma exceção. Ao instanciar a classe cliente na função main(),
    não esquecer de colocar dentro de um bloco try catch.*/

    print("Ola cliente, digite seu nome: ")
    val nome = readLine()!!

    print("Ola cliente, digite seu endereço: ")
    val endereco = readLine()!!

    print("Ola cliente, digite seu telefone: ")
    val telefone = readLine()!!

    try {
        val lily = Cliente("Lily", endereco, telefone)
    } catch (e: Exception) {

    }
    while (true){
        println("\n***Menu***\n")
        println("1 - Adicione itens no carrinho: ")
        println("2 - Remova itens do carrinho: ")
        println("3 - Lista os itens do carrinho: ")
        println("Digite qualquer outro valor para sair: ")

        /*println("\nDigite a opção desejada: ")
        val opc = readLine()!!.toInt()*/

        var opc = 0

        while (true){
            println("\nDigite a opção desejada: ")
            try {
                opc = readLine()!!.toInt()
                break
            }catch (e: Exception){
                println("Valor inválido")
            }
        }
        when(opc){
            1 -> {
                println("Digite o item a ser adcionado")
                val item = readLine()!!
                lily.removeCompra(item)
            }
            2-> {
                println("Digite o item a ser adcionado")
                val item = readLine()!!
                lily.removeCompra(item)
            }
            3-> lily.listarCompras()
            else -> break
        }
    }
}
}












