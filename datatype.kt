import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter your name: ")
       val name = scanner.nextLine()
    println("Your name is: $name")

    println("Enter your age:")
    if (scanner.hasNextInt()){
        val age = scanner.nextInt()
        println("Your age is $age ")
    }else{
        println("Your age is invalid")
    }

    println("Enter your balance:")
    if (scanner.hasNextDouble()){
        val balance = scanner.nextDouble()
        println("Your balance is $balance ")
    }else{
        println("Input is invalid")
    }

    println("Are you a Student(True/False):")
    if (scanner.hasNextBoolean()){
        val student = scanner.nextBoolean()
        println("are you a Student: $student ")
    }else{
        println("Input is invalid")
    }
}

