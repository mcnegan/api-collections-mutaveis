package code.painel.collections.mutaveis

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
)
fun main() {
    val joao = Funcionario("João", 1800.0, "CLT")
    val mauricio = Funcionario("Mauricio", 1212.0, "PJ") // Instancias
    val maria = Funcionario("Maria", 1550.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

}

