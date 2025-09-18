fun computeStepCount(start: Int): Int {
    require(start > 0) { "Only positive integers are allowed" }
    var inicio = start.toLong()
    var cont = 0
    while (inicio != 1L){
        if (inicio.mod(2) == 0) {
            inicio = inicio /2
            cont++
        } else {
            inicio = (inicio*3) + 1
            cont++
        }
    }
    return cont
}

fun main(){
    println(computeStepCount(12))
}