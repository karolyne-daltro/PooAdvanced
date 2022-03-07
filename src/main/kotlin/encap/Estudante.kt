package encap

data class Estudante (val nome: String, private val ra: Int){

    private var nota = 0.0

    private val cursos = mutableListOf<String>()

    fun alterarNota(valor: Double){
        if(valor < 0 || valor > 10){
            println("Nota inválida")
        }else{
            nota = valor
            println("Nota alterada com sucesso!")
        }

    }
    fun cadastrarCurso(curso: String){
        if (curso.isEmpty()){
            println("Curso inválido")
        }else{
            cursos.add(curso)
        }

        fun removerCurso(curso: String){
            if (curso.isEmpty()){
                println("Curso inválido")
            }else if(cursos.contains(curso)){
                cursos.remove(curso)
                println("Curso removido com sucesso.")
            }else{
            println("Esse curso não existe na lista")
            }
        }

        fun listarCursos(){
            cursos
        }
    }

}