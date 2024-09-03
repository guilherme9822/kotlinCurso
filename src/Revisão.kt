fun main (){
    cinema()
}

fun cinema (){
    println("Qual o Filme ira assistir?")
    val filme = readln()
    if (filme != ""){
        if (filme == "O amanha"){
            println("O filme que voce vai assistir é O amanha.")
        }else{
            println("Esse filme nao esta em cartaz no momento.")
            return
        }
        println("Quantas cadeiras voce quer??")
        val quantidadeCadeiras = readln()
        val qc = quantidadeCadeiras.toInt()
        if (qc >= 1){
        }else{
            println("Voce tem que escolher a quantidade.")
            return
        }
        println("Qual seu Nome??")
        val nome = readln()
        print("O seu nome é $nome.\n")
        println("Qual sua idade??")
        val idade = readln()
        val ida = idade.toInt()
        if (ida >= 18){
            println("Bem vindo ao nosso Cinema espero que goste do filme.")
        }else{
            println("Voce é menor de idade nao pode assistir esse filme.")
            return
        }

    }
}