import java.security.Principal
import kotlin.math.*

/**fun main(){
helloWorld()
println("A soma de 10 e 5 é ${sum(10,5)}")
}
fun sum (a: Int,b: Int): Int{
return (a + b)
}
fun helloWorld () {
println("Hello, world!")
}**/

/**fun main(){
val str = "Programação Kotlin."


println("Tamanho da string: ${str.length}")
println("Posição (index) 0 da string: ${str[0]}")
println(str.startsWith("Pro"))
println(str.endsWith("abc"))
println(str.substring(2,5))
println(str.replace("Kotlin.", "Kotlin é de mais!"))
println(str.lowercase())
println(str.uppercase())

println("        meu nome é             ".trim())

}**/

/**fun main() {

println(max(5, 10))
println(min(5,10))
println(sqrt(45.67f))
println(PI)
println(E)
println(round(344.12313))
}**/

//Exercicio
//1
fun converteAnos(anos: Int) {

    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

//2
fun caracters(str: String) = str.length

//3
fun calcularCubo(n: Int) = n * n * n

//4
fun milhasKm (milhas: Float) = milhas * 1.6f

//5
fun exr5 (str: String) {
   println(str.replace("A", "x").replace("a", "x").lowercase())
}





fun main() {
    println(converteAnos(2))
    println(caracters("naoiufwaibfbw fciuasfsbvkjh"))
    println(calcularCubo(3))
    println(milhasKm(100f))
    println(exr5("AaAaAAaAAaAAA Fulano FALA de Mais ifaaabnuiweADASD"))
}

