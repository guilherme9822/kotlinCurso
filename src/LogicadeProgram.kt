/*1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a
soma entre A e B é mostre se a soma é menor que C.*/
fun exer1() {
    var a = 3
    var b = 5
    var c = 12
    var soma = a + b

    if (soma < c) {
        println("O valor da soma é $soma e é maior que C que o valor é $c")

    }
}

/*2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o
número é par ou ímpar, positivo ou negativo.*/
fun exer2() {
    println("Digite um valor.")
    var n = readln()
    var i = 0
    if (n != "") {
        var num = n.toInt()
        if (num >= i) {
            println("Esse número é positivo.")
        } else {
            println("Esse número é negativo.")
            return
        }
        if (num != 0) {
            var par = 0
            par = num % 2
            if (par == 0) {
                println("O Número é Par.")
            } else {
                println("O Número é Impar.")
            }
        }
    }
}

/*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final
de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu
valor na tela.*/
fun exer3(a: Int, b: Int) {
    var c = 0
    if (a == b) {
        c = a + b
        println("Os dois valores são iguais então o resultado da soma é $c")
    } else {
        c = a * b
        println("Os dois valores são diferentes então o resultado da Multiplicação é $c")

    }
}

/*4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.*/
fun exer4(a: Int) {
    var ant = 1
    println("O número antecessor dele é ${a - ant}")
    println("O número sucessor dele é ${a + ant}")
}

/*5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
(Base para o Salário mínimo R$ 1.293,20).*/
fun exer5(salarioUsuario: Float) {
    val salarioMinimo = 1293.20f
    val salario = salarioUsuario / salarioMinimo
    println("O usuario recebe $salario mínimos")
}

/*6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.*/
fun exer6(valor: Float) {
    var rea = valor * 0.05f
    var ajuste = valor + rea
    print(ajuste)
}

/*7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.*/
fun exer7(a: Boolean, b: Boolean) {
    if (a == true && b == true) {
        println("O valor de A é $a")
        println("O valor de B é $b")
    } else {
        println("O valor de A é $a")
        println("O valor de B é $b")
    }
}

/*8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.*/
fun exer8() {
    // Ler três valores inteiros diferentes
    print("Digite o primeiro valor inteiro: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor inteiro: ")
    val valor2 = readLine()!!.toInt()

    print("Digite o terceiro valor inteiro: ")
    val valor3 = readLine()!!.toInt()

    // Encontrar e imprimir os valores em ordem decrescente
    val (a, b, c) = listOf(valor1, valor2, valor3).sortedDescending()

    println("Valores em ordem decrescente: $a, $b, $c")
}

/*9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
leia o seu peso e sua altura e imprima natela sua condição de acordo com a
tabela abaixo:
Fórmula do IMC = peso / (altura)²
Tabela Condições IMC
 Abaixo de 18,5   | Abaixo do peso

 Entre 18,6 e 24,9 | Peso ideal (parabéns)

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)*/

fun exer9() {
    println("Qual é o seu Peso??")
    var peso = readln().toFloat()
    println("Qual é a sua Altura??")
    var altura = readln().toFloat()
    var imc = (peso / (altura * altura))

    println(imc)

    if (imc <= 18.5)  println("Abaixo do peso ")

    if (imc <= 24.9 && imc >= 18.6) println("Levemente acima do peso")

    if (imc <= 29.9 && imc >= 25.5) println("Levemente acima do peso")

    if (imc <= 34.9 && imc >= 30.0) println("Obesidade grau I")

    if (imc <= 39.9 && imc >= 35.0) println("Obesidade grau II (severa)")

    if (imc >= 40.0) println("Obesidade grau III (mórbida)")

}

fun main() {
    exer9()
}