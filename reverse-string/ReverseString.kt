fun reverse(input: String): String {
    var strRev = ""
    for (i in input.length-1 downTo 0) {
        strRev += "${input[i]}"
    }
    return strRev
}

fun main(){
    println(reverse("Hello"))
}