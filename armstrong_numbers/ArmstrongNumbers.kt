fun check(input: Int): Boolean {
        val inputString = input.toString()
        val tamanho = inputString.length
        var cont = 0
        for (i in 0..tamanho-1){
            cont += (inputString[i].digitToInt()).toDouble().pow(tamanho).toInt()
        }
        return cont == input
    }

fun main(){
    println(check(100))
}