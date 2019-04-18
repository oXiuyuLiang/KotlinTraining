package io.access.kotlintraining

class MyCustomClass constructor(){
    var counter: Int = 0
    var propertyWithCounter: Int = 0

    set(value){
        counter++
        field = value
    }

    /* TODO: ここにカスタムセッターを書く */
}


