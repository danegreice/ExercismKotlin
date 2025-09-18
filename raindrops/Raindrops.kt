fun convert(n: Int): String {
        var result = ""
        if (n.mod(3) == 0){
            result += "Pling"
        }
        if (n.mod(5) == 0){
            result += "Plang"
        }
        if (n.mod(7) == 0){
            result += "Plong"
        }

        if (result.isEmpty()){
            return n.toString()
        } else {
            return result
        }
    }

fun main(){
    println(convert(28))
}