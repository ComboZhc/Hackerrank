object Solution {
    val fibs: Stream[Int] = 0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
    def fibonacci(x:Int):Int = fibs(x-1)

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
