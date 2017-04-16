object Main {
    
    def main(args: Array[String]) {
        val a = new Rational(1,2)
        val b = new Rational(3,4)

        println(a + b)
        println(a max b)
    }

    class Rational( x:Int, y:Int ) {
    
        def nume = x
        def demo = y

        def + (that : Rational ) : Rational = {
            new Rational(this.nume * that.demo + that.nume * this.demo, this.demo * that.demo)
        }

        def < (that: Rational) : Boolean = this.nume * that.demo < this.demo * that.nume 

        def max (that : Rational ): Rational = if (this < that) that else this

        override def toString = nume + "/" + demo
    }
}