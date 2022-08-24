package classesAbstratas

 class preguica (
    nome: String,
    idade: Int,
    lives: Int,
    val habitat: String
) : Animal(nome, idade, lives) {

    override fun emitirSom() {
        println("O som que ele emite é: roong,ZZZZ, de soninho!\n")
    }
    override fun locomocao() {
        println("Como ele se locomove: Apesar de eu ser preguiçosa, costumo subir em arvores!\n")
    }
    fun dorme(){
        println("Oque ele faz: Sou um bichinho dorminhoco,consigo dormir cerca de 20 horas por dia!\n")
    }

    override fun exibirDados() {
        println("O nome do bixo preguiça é: $nome\n" +
                "A idade do bixo preguiça é: $idade\n" +
                "A expectativa de vida dele é: $lives\n" +
                "A habitat do bixo preguiça é: $habitat\n")
        melhorAmigo()
        emitirSom()
        locomocao()
        dorme()
    }
}