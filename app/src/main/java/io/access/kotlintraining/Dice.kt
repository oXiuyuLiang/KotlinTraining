package io.access.kotlintraining

import java.util.*

class Dice(i: Int) {
    public var total = i
    var count = 0
    fun roll(): Int{
        count++
        if(count > 100){
            throw Exception("I was broken")
        } else {
            var result = 0;
            val random = Random()
            result = random.nextInt(total)

            println("count:"+count)
            return result
        }
    }
}