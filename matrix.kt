import java.util.Scanner

fun matrix() {
    val scanner = Scanner(System.`in`)

    println("enter the number of rows")
    val rows = scanner.nextInt()

    println("enter the number of columns")
    val columns = scanner.nextInt()

    val matrix = Array(rows) { IntArray(columns) }
    println("matrix element")
    for (i in 0..<rows) {
        for (j in 0..<columns) {
            println("[$i] [$j]")
            matrix[i][j] = scanner.nextInt()
        }
    }
    for (i in 0..<rows) {
        for (j in 0..<columns) {
            print("${matrix[i][j]}\t")
        }
        println()

    }
    }

    fun main() {
        matrix()
    }
