package com.lsw.demo.kotlindemo

/**
 * Create by liushuwei on 2020/8/11
 */
// 这边增加的 name 和 age 字段不能声明成 val，因为在主构造函数中声明 val 或 var 的参数会将自动
// 成为该类的字段，这会导致和父类中同名的字段冲突
class Student2(val sno: String, val grade: Int, name: String, age: Int) : Person2(name,age),Study{
    //如果想在实例化类时在主构造函数中实现一些逻辑，则可以将逻辑写在 Kotlin 提供的 init结构体中
    init {
        // 实例化时打印学号和年级
        println("sno is $sno")
        println("grade is $grade")
    }

    //当一个类既有主构造函数也有次构造函数时，所有的次构造函数都必须调用主构造函数（包括间接调用）。
    constructor(name: String, age: Int) : this("", 0, name, age){ }

    constructor() : this("", 0){ }

    override fun readBooks() {
        println("$name is reading")
    }

    override fun doHomework() {
        println("$name is doing homework")
    }
}