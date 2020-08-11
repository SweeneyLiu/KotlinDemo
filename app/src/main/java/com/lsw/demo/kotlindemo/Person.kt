package com.lsw.demo.kotlindemo

/**
 * Create by liushuwei on 2020/8/11
 */
open class Person {
    var name = ""
    var age = 0

    fun eat(){
        println("$name is eating. He is $age years old")
    }
}