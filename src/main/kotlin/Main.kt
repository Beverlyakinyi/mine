//
//Write a Kotlin program to print “Hello, World!”
fun main(){
    println("Hello, World!")
    println(sum(55,77))
    println(prime(54,12))
    println(subtraction(100043,54768))
}
//Create a program to calculate the sum of two numbers in Kotlin
fun sum(x:Int,y:Int):Int{
    var name=x
    var word=y
    var naming=x + y
    return naming
}
//find the avarage of  a schol near you
fun prime(num1:Int,num2:Int):Int {
    var x = num1 + num2
    var b = x / 2
    return b
}
//differenciate the current gender in your community
fun subtraction(x: Int,y: Int):Int{
    var name=x
    var word=y
    var nameing=x - y
    return nameing
}