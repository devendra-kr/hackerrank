//https://www.hackerrank.com/challenges/eval-ex/problem
import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {



    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        for (nItr <- 1 to n) {
            val x = stdin.readLine.trim.toDouble
            val res = evaluat(x, 1)
            println(res)
        }
        
        def evaluat(x: Double, term: Int): Double = {
            term match {
                case 10 => 1
                case _ =>( Math.pow(x, term.toDouble) /fact(term)) + evaluat(x, term + 1)
                
            } 
        }
        
        def fact(x: Int): Int = {
            x match {
                case 1 => 1
                case _ => x * fact(x - 1)
            }
        }
    }
}
