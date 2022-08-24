package classesAbstratas

class Cachorro(
    nome: String,
    idade: Int,
    lives: Int,
    val raca: String
) : Animal(nome, idade, lives) {

    override fun emitirSom() {
        println("O som que ele emite é:: Au!Au!\n")
    }
    override fun locomocao() {
        println("Como ele se locomove: O cachorro correm\n")
    }

    override fun exibirDados() {
        println("O nome do cachorro é: $nome\n" +
                "A idade do cachorro é: $idade\n" +
                "A expectativa de vida dele é: $lives\n" +
                "A raça do cachorro é: $raca\n")

        melhorAmigo()
        emitirSom()
        locomocao()
        saltar()
        lambidas()
        petisco()
    }
}