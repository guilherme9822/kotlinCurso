/**fun maiorDeIdade(idade: Int){
if (idade >= 18) {
println("Maior de idade.")
if (idade > 60){
println("Terceira idade")
}
}else if (idade < 10){
println("Criança")
}
else {
println("Menor de idade.")
}
}**/

/**fun saudacao (dia: Boolean) {
if (dia){
println("Bom dia")
}else{
println("Boa Noite")
}
}**/

/**fun main () {

//maiorDeIdade(34)
//maiorDeIdade(15)
//saudacao(false)
/**val num = 10
if(num > 20){
println("Numero Maior que 20")
}
if(num < 20){
println("Numero Menor que 20")
}**/


}**/

fun bonus(cargo: String): Float {
    if (cargo == "Gerente") {
        return 2000f
    } else if (cargo == "Coordenador") {
        return 1500f
    } else if (cargo == "Engenheiro de software") {
        return 1000f
    } else if (cargo == "Estagiario") {
        return 500f
    }
    return 0f
}

fun main() {
    val bonus = bonus("Coordenador")
    println(bonus)
}
