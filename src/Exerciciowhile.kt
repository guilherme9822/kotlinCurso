fun exe1 (){
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0
    while ((numBaloes * capBalao) + capBalao < capCaixa){
        numBaloes++
    }
    println("Cabem $numBaloes balões na caixa d'água.")
}

fun exe2 (){
    var i = 1
    while (i <= 50){
        if (i % 15 == 0){
            print("FizzBuzz ")
        }else if (i % 3 == 0){
            print("Buzz ")
        }else if (i % 5 == 0){
            print("Fizz ")
        }else{
            print("$i ")
        }
        i++
    }
}

fun exe3 (str: String){
    var i = str.length - 1
    while (i >= 0){
        print(str[i])
        i--
    }
}

fun exe4 (str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length){
        if (strLower[i] == 'x'){
            countX++
        }else if (strLower[i] == 'o'){
            countO++
        }
        i++
    }

    return ((countX == countO) && (countX != 0))
}

fun main(){
    println(exe4("Xxooox"))
    println(exe4("xxxxo"))
    println(exe4("vbfkjdkhf"))
    println(exe4("ooooxzzzzz"))
}