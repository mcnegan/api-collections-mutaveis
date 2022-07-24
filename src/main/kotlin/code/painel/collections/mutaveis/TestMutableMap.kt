package code.painel.collections.mutaveis

fun main() {
    val joao = Funcionario("João", 1800.0, "CLT")
    val pedro = Funcionario("Pedro", 1212.0, "PJ") // Instancias
    val maria = Funcionario("Maria", 1550.0, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("------------------------")
    repositorio.findAll().forEach {
        val it = joao.nome
        println(it)
    }

}

private fun Any.forEach(function: () -> Unit) {

}

class Repositorio<T> {
    fun create(nome: String, joao: T) {

    }

    fun findById(nome: String) {

    }

    fun findAll() {

    }


}
