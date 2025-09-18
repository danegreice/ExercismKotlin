object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        var inicio = 0
        var fim = list.size - 1

        while (inicio <= fim) {
            var meio = (inicio+fim)/2
            if (list[meio] == item) {
                return meio
            } else if (list[meio] < item) {
                inicio = meio + 1
            } else {
                fim = meio - 1
            }
        }

        throw NoSuchElementException("Não encontrado")
    }
}

fun main() {
    val lista = (1..1_000_000).toList()
    println(BinarySearch.search(lista, 999_999)) // deve retornar índice 999_998
}