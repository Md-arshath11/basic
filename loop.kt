
fun main(){
    println("For Loop")
    for (i in 0..10){
        println("Numbers:$i ")
    }

    for (i in 1..10 step 2){
        println("Numbers:$i ")
    }

    println("While Loop")
    var a=1
    while (a<=5){
        println("Numbers:$a")
        a++
    }

    println("Do While Loop")
    var a2=0
    do {
        a2++
        if (a2%2==0){
            continue
        }
        println("odd Number:$a2")

    }while (a2<10)

    val numbers= arrayOf(1,2,3,4,5)
    println("forEach loop:")
    numbers.forEach { num -> println("Element: $num") }

    traffic()
}

fun traffic(){
    val day= 1

    when(day){
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("Unknown day")
    }
}