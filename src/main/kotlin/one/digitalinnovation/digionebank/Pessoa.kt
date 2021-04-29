package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Bruno"
    var cpf: String = "123.456.789.10"
    private set     // Não permite que os dados sejam alterados em outro escopo

    inner class Endereco {
        var rua: String = "Rua do caminho"
    }

    constructor() // Criar um construir construtor secundário

    fun mostrarDados() = "Nome: $nome e Cpf: $cpf"
}

fun main(){
    val bruno = Pessoa()

    println(bruno.nome)
    println(bruno.cpf)
    println(bruno.Endereco().rua)

    println(bruno.mostrarDados())

}