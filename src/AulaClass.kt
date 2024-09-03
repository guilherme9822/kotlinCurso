class Pessoa(){
    val nome = readln()
    val dataDeNascimento = readln()
    var telefone = readln()
    val idade = readln().toInt()
    var peso = readln().toFloat()
    var altura = readln().toFloat()


}



fun main(){
val pessoa: Pessoa = Pessoa()
    println("Seu Nome é ${pessoa.nome}.")
    println("Voce tem ${pessoa.idade} anos.")
}