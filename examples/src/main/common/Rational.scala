package common

// define the class named Rational
// which can do add, max ect.
class Rational( x:Int, y:Int ) {
    // first define the members
    def nume = x
    def demo = y

    def + (that : Rational ) : Rational = {
        new Rational(this.nume * that.demo + that.nume * this.demo, this.demo * that.demo)
    }

    def < (that: Rational) : Boolean = this.nume * that.demo < this.demo * that.nume 

    def max (that : Rational ): Rational = if (this < that) that else this

}