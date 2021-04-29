package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    // modo mais resumido (sem explicitar o elemento)
    println()
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    println()
    val pf = ClienteTipo.PF
    println("${pf.name} ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} ${pj.descricao}")
}