import kotlin.math.sqrt

fun score(x: Number, y: Number): Int {
        val dx = x.toDouble()
        val dy = y.toDouble()
        val distancia = sqrt(dx * dx + dy * dy)
        return when{
            distancia <= 1.0 -> 10
            distancia <= 5.0 -> 5
            distancia <= 10.0 -> 1
            else -> 0
        }
    }
fun main(){
    println(score(-9, 9))
}