package io.access.kotlintraining

class FizzBuzz{
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
}
