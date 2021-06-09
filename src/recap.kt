fun main(){
   var x =checkPassword("password")
    println(x)
    CheckLetters()
    looping()
    whileLoop()
    letters()
    checkyear(2020)
}
fun checkPassword(password:String):Boolean{
    if (password.length>=8 && password.length<=16){
        if(password=="password"){
     return  false
        }

        return true

    }
    return  true
}

fun CheckLetters(){
    var x="l"
    if(x >="a" && x<="z" || x>="A "&& x<="Z"){
        println( " $x is an alphabet")
    }
    else{
        println("$x is not an alphabet")
    }
}

//while loop
fun looping(){
    var i=1
    while (i<5){
        println(i)
        i++
    }
}
fun whileLoop(){
    var sum =0
    var x=100
    while (x!=0){
        sum+=x
        --x
    }
    println(sum)

}


fun letters(){
    var a=30
    var n="30"
    when(n) {
        "cat" -> println("cat? really?")
        12.toString()-> println("close but not enough")
        a.toString()-> println("Bingo it is eleven")
    }
}
fun checker(){
    var b=100
    when(b){
        in 1..10-> println("A positive number less than eleven")
        in 10..100-> println("a positive number greater than ten")
    }

}

fun checkyear(year:Int){
    if (year%4==0){
        println("$year is a leap year ")
    }
    else {
        println("$year is not a leap year")
    }
}