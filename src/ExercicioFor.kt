fun main(){
    ex5()
}


fun ex1(){
    for (i in 1..50){
        print("$i")
    }
}

fun ex2(){
    for (a in 50 downTo 1){
       print("$a")
   }
}

fun ex3(){
    for (i in 1..50){
        if(i%5 != 0){
            print("$i")
        }

    }
}

fun ex4(){
    var soma = 0
    for (i in 1..500){
        soma += i
        println(soma)
    }
}

fun ex5(){
    println("Digite um valor.")
    var numero = readln()
    var n =numero.toInt()

    for (i in 1..n) {

       for (j in 1..i){
           print("#")
       }
        println()
    }
}