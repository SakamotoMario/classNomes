class Pessoa(
    val nome: String,
    val idade: Int
)


fun main() {
    val pessoa1: Pessoa = Pessoa("Mario", 28)
    val pessoa2: Pessoa = Pessoa("Diego", 28)

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 1: ${pessoa1.idade}")
    
}