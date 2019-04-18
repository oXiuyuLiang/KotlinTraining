package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function
fun hello() {
    println("Hello World!")
}
fun fizzbuzz() : String{
    var result1 =""
    for (n in 1..100){
        if (n%3 == 0 && n%5 == 0){
            println("FizzBuzz")
            result1 = "FizzBuzz"
        }else if (n%5 == 0) {
            println("Buzz")
            result1 = "Buzz"
        }else if (n%3 == 0) {
            println("Fizz")
            result1 =  "Fizz"
        }else{
            println(n)
            result1 = n.toString()
        }

    }
    return result1
}

// うるう年かどうかを判定する関数
fun isLeapYear(y: Int): Boolean {
    // TODO: 実装する
    var result2 = true

    if(y % 4 == 0){
        if(y % 100 == 0 && y % 400 !=0){
            result2 = true
        }else{
            result2 = false
        }
    }else{
        result2 = false;
    }
    println(result2)
    return result2
}

fun power(a: Int, n: Int): Long {
    var result3 = 0
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        result3 = 0
    }else if( n == 0){
        result3 = 1
        return result3.toLong()
    }else {
        result3 = (a * power(a,n-1)).toInt()
    }

    return result3.toLong()
}

fun result5(a: Int, n: Int):Long{
    println(power(a,n))
    return power(a,n)

}

fun judgeOddEven(a: Int):Boolean{
    var result1 = false
    var result2 = false;
    result1 = a.isOdd(a);
    result2 = a.isEven(a);
    println("Odd:"+result1)
    println("Even"+result2)

    return result1
}

fun Int.isOdd(a:Int):Boolean{
    //println("dd"+this.toInt())
    var result = false
    if(a % 2 != 0){
        result = true
    }else{
        result = false
    }
    return result
}

fun Int.isEven(b: Int):Boolean{
    var result = false
    if(b % 2 != 0){
        result = true
    }else{
        result = false
    }
    return result
}




