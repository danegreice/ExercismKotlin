fun yearB(ano: Int): Boolean{
        if (ano.mod(100) == 0){
            if (ano.mod(400) == 0) {
                return true
            } else{
                return false
            }
        } else {
            if (ano.mod(4) == 0){
                return true
            } else {
            return false
            }
        }
    }

fun main(){
    println(yearB(1900))
}