package classesAbstratas

abstract class Animal (
    val nome: String,
    val idade: Int,
    val lives: Int
) {
    open fun melhorAmigo(){
        println(":::Melhor amigo que um humano poderia ter:::")
    }
    open fun saltar(){
        println("Sou um cachorro que balança o rabinho quando estou feliz!  ")
    }
    open fun lambidas(){
        println("Dou lambidinhas de amor :) !")
    }
    open fun petisco(){
        println("Adoro que me deem petiscos a mais :D !")
    }
    open fun saltitar(){
        println("Sou conhecido por saltitar bem alto quando to feliz!")
    }
    open fun velocidade(){
        println("Sou um dos animais mais rapidos do mundo ,tá!")
    }


    abstract fun emitirSom()

    abstract fun locomocao()

    abstract fun exibirDados()


}

