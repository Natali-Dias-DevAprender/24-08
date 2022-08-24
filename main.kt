package classesAbstratas


fun main(){

    val cachorro = Cachorro("Rabito",
        6,
        10,
        "vira-lata")

    val cavalo = Cavalo("Cleitin", 19, 28, "Shire")

    val preguica = preguica("Junin", 5, 10, "Selva")

    println("1 - Cachorro")
    println("2 - Cavalo")
    println("3 - Bixo preguiça")
    print("Escolha um desses animais abaixo,por favor: ")
    when (readln().toInt()) {
        1 -> cachorro.exibirDados()
        2 -> cavalo.exibirDados()
        3 -> preguica.exibirDados()
        else -> println("Opção Inválida")

    }

}

