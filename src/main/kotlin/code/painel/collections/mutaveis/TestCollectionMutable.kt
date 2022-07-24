package code.painel.collections.mutaveis

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
)
fun main() {
    val joao = Funcionario("João", 1800.0, "CLT")
    val pedro = Funcionario("Pedro", 1212.0, "PJ") // Instancias
    val maria = Funcionario("Maria", 1550.0, "CLT")

    println("--------Listar-------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------Adicionar-------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }
    println("--------Remover--------------")
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }
    println("--------Set--------------")
    val funcionarioSet = mutableSetOf(joao)
    //funcionarioSet.forEach { println(it) }

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("--------Remove---------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}

