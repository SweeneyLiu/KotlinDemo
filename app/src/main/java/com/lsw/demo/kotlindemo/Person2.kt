package com.lsw.demo.kotlindemo

/**
 * Create by liushuwei on 2020/8/11
 */
open class Person2(val name: String, val age: Int) {
    fun eat() {
        println("$name is eating. He is $age years old")
    }
}