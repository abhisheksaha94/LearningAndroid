package `in`.tutorials.helloworld

fun main(){
    overNineThousand()
    humidityCheck()
    add(5,3)
    println("AddUp = " + addUp(10,20).toString())
    println("Average = " + average(10.3,20.0).toString())



}

fun overNineThousand() {
    for (num in 1..10000) {
        if (num == 9001)
            println("IT'S OVER 9000!!!")
    }
}

fun add( first: Int, second: Int){
    println("Sum = ${first + second}")
}

fun addUp( first: Int, second: Int) : Int{
    return first + second
}

fun average(first: Double, second: Double) : Double{
    return (first + second) / 2
}

fun humidityCheck(){
    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased $humidityLevel")
        if (humidityLevel < 60) {
            humidity = "comfy"
            println("it's comfy now $humidityLevel")
        }
    }
}

fun checkNullable(){
    var name: String = "Abhishek"
    var nullableName: String? = "Abhishek"
    nullableName = null
    name = nullableName ?: "Guest"
    nullableName!!.toLowerCase()
}
