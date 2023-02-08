fun main() {
greetingPeople("Maureen")
     var y= addition(63,45,35,67)
    println(y)
     var x =modul(67,4)
    println(x)
    fact("Programing is My Hobby")
}
fun greetingPeople(name: String){
    println("Hello"+ name)

}
fun modul(num1: Int,num2: Int) :Int {
    var modulus = num1 % num2
    return(modulus)
}
fun addition(num1: Int, num2: Int,num3: Int, num4: Int) :Int{
    var sum=num1+num2+num3+num4
    return(sum)

}
fun fact(name: String){
    println(name)
}