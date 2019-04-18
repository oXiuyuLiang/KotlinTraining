package io.access.kotlintraining

class NabeAtsu {
    // TODO: 実装する
    var counter: Int = 0
    set(value){

        field = value
    }

    fun next(): String {
        // TODO: 実装する
        counter++

        if(counter %3 == 0 || counter.toString().contains("3")){
            println("Aho")
        }else{
            println(counter)
        }
        return ""
    }
}

// 呼び出しイメージ
fun main(args: Array<String>) {
    val n = NabeAtsu()
    for (i in 1..100) {
        println(n.next())
    }
}