package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c==0 | r==c) 1
      else pascal(c-1, r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def readin(a:Char)= {
        if (a=='(') 1
        else if (a == ')') -1
        else 0
      }

      // loop return the balance result
      def loop(chars: List[Char], acc: Int):Boolean = {
        if (chars.isEmpty) acc==0
        else if (acc < 0) false
        else loop(chars.tail, acc + readin(chars.head)) 
      } 

      loop(chars,0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0) 0
      else if (coins.isEmpty) 0
      else coins.map(x => countChange(money-x, coins.filter(y => y>=x))).sum
    }
  }
