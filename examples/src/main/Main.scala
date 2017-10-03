

object Main {
    import common.Rational
    
    def main(args: Array[String]) {
        val a = new Rational(1,2)
        val b = new Rational(3,4)

        println(a + b)
        println(a max b)
    }

}