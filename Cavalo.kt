package classesAbstratas

class Cavalo (

    nome: String,
    idade: Int,
    lives: Int,
    val tipo: String
) : Animal(nome, idade, lives) {

    override fun emitirSom() {
        println("O som que ele emite é:: Hiin in in! rilinchin ,meu bem!\n")
    }
    override fun locomocao() {
        println("como ele se locomove: o cavalo galopa\n")
    }

    fun abanarRabo(){
        println("Oque ele faz: o cavalo abana o rabo e a crina\n")
    }

    override fun exibirDados() {
        println("O nome do cavalo é: $nome\n" +
                "A idade do cavalo é: $idade\n" +
                "A expectativa de vida dele é: $lives\n" +
                "O tipo do cavalo é: $tipo\n")

        melhorAmigo()
        emitirSom()
        saltitar()
        velocidade()
        abanarRabo()

    }
}