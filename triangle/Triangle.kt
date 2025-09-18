class Triangle(val xa: Number, val xb: Number, val xc: Number) {
    private val a = xa.toDouble()
    private val b = xb.toDouble()
    private val c = xc.toDouble()

    init {
        if (this.a <= 0.0 || this.b <= 0.0 || this.c <= 0.0) {
            throw IllegalArgumentException("Sides must be positive")
        }
        if (this.a + this.b <= this.c ||
            this.b + this.c <= this.a ||
            this.a + this.c <= this.b) {
            throw IllegalArgumentException("Sides do not form a valid triangle")
        }
    }

    val isEquilateral: Boolean = (a == b && b == c)
    val isIsosceles: Boolean = (a == b || b == c || a == c)
    val isScalene: Boolean = (a != b && b != c && a != c)
}