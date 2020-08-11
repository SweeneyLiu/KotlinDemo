package com.lsw.demo.kotlindemo

/**
 * Create by liushuwei on 2020/8/11
 */
//类中只有次构造函数，没有主构造函数（当一个类没有显式定义主构造函数且定义了次构造函数时，它就是没有主构造函数的），此时继承类时就不需要再加上括号了
class SpecialStudent : Person2 {
    constructor(name: String, age: Int) : super(name, age) { }
}