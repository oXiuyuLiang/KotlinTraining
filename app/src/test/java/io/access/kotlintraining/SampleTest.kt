package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function
//        //hello();
//        isLeapYear(2900)
//        //fizzbuzz();
//        //result5(3,2);

//        val a  = 9;
//        a.isEven(a);
//        a.isOdd(a);
//
//        val d = Dice(16)
//        for (i in 1..100) {
//            println(d.roll()) // 1〜16 までの数字
//        }
//        println(d.roll()) // Exception


        val p = MyCustomClass()
        p.propertyWithCounter = 123
        p.propertyWithCounter = 456
        p.propertyWithCounter = 789
        println(p.counter) // 3
    }
}