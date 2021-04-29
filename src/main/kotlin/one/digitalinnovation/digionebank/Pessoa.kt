package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Bruno"
    var cpf: String = "123.456.789.10"

    inner class Endereco {
        var rua: String = "Rua do caminho"
    }
}

fun main(){
    val joao = Pessoa()

    println(joao.nome)
    println(joao.cpf)
    println(joao.Endereco().rua)
}