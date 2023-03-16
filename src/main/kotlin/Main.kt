fun main() {
odd(100)
    people(2)
    people(14)
    people(17)
    var number= arry(arrayOf("ann","akech","ivy","ruth","kiki","montana","maryann"))
    println(number)
    new()

}

fun odd(numb:Int){
    for(u in 1..100){
        if(u % 2 !=0){
            println(u)
        }
    }

}
fun arry(names:Array<String>):Int{
var longerthanfive = 0
    for (name in names){
        if (name.length>5){
            longerthanfive++
        }
    }
return longerthanfive
}


fun people(age:Int){
    if(age in 0..6){
        println("milk")
    }else if (age in 7..14){
        println("fanta orange")
    }else{
        println("coca cola")
    }
}

fun new(){
    for (num in 1..100){
        if (num%3==0 && num%5==0){
            println("fizzbuzz")
        }
        else if(num%3==0){
            println("fizz")
        }
        else if (num%5==0){
            println("buzz")
        }
        else{
            println(num)
        }
    }
}