fun main() {
    figuraGeometrica()
    triangulo()
    qualASaida(num = 4)
    festa()

}

fun figuraGeometrica() {

    println("Digite o Valor da Base da figura")
    val base = readln()
    println("Digite o Valor da Altura da figura")
    val altura = readln()

    if (base != "" && altura != "") {
        if (base == altura) {
            println("A figura é um quadrado.")
        } else {
            println("A figura não é um quadrado.")
        }
    }
}

fun triangulo() {

    println("Digite o Valor do lado1:")
    val lado1 = readln()
    println("Digite o Valor do lado2:")
    val lado2 = readln()
    println("Digite o Valor do lado3:")
    val lado3 = readln()

    if (lado1 != "" && lado2 != "" && lado3 != "") {
        if ((lado1 == lado2) && (lado2 == lado3)) {
            println("É um triangulo equilatero.")
        } else {
            println("O triangulo não é equilatero.")
        }
    }

}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun festa() {
    println("Qual a sua idade??")
    val idade = readln()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado menores de idade nao sao permitidos")
            return
        }

    }

    println("O seu tipo de convite??")
    var tipoConvite = readln()

    if (tipoConvite != null && tipoConvite != ""){
        tipoConvite = tipoConvite.lowercase()
        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo"){
            println("Qual o codigo do convite??")
            var codigo = readln()
            if (codigo != null && codigo != ""){
                codigo = codigo.lowercase()
                if (tipoConvite == "comum" && codigo.startsWith("xt")){
                    println("Welcome :)")
                }else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl")){
                    println("Welcome :)")
                    }else {
                        println("Negado. Convite invalido.")
                        return
                }

            }

        }else {
            println("Negado. Convite invalido.")
            return
        }
    }
}