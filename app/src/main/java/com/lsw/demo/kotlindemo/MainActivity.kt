package com.lsw.demo.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val range = 0..10 // 数学中的[0, 10]
//    val range = 0 until 10 // 数学中的[0, 10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
        //list
//        val list = listOf("apple", "orange", "pear")//创建不可变集合

//    val list = ArrayList<String>()
//    list.add("apple")
//    list.add("orange")
//    list.add("pear")

//        val list = mutableListOf("apple", "orange", "pear")//创建可变集合

        //set
//        val set = setOf("apple", "orange", "pear")//不可变
        val set= mutableSetOf("apple", "orange", "pear")//可变

        //map
//        val map = HashMap<String, Int>()
//        map.put("apple", 1)
//        map.put("orange", 2)
//        map.put("pear", 3)

        val map = HashMap<String, Int>()
        map["apple"] = 1
        map["orange"] = 2
        map["pear"] = 3

//        val map = mapOf("apple" to 1, "orange" to 2, "pear" to 3)

        //找到单词最长的那个水果
//        val list = listOf("apple", "orange", "pear")
//        var maxLengthFruit = ""
//        for (fruit in list){
//            if (fruit.length > maxLengthFruit.length){
//                maxLengthFruit = fruit
//            }
//        }
//        println("max length fruit is $maxLengthFruit")

        val list = listOf("apple", "orange", "pear")
        val maxLengthFruit = list.maxBy { it.length }
        println("max length fruit is $maxLengthFruit")

    }

    //if条件语句用法1
    fun largerNum(num1: Int, num2: Int): Int {
        var value = 0
        if (num1 > num2) {
            value = num1
        } else {
            value = num2
        }
        return value
    }

    //if条件语句用法2
//    fun largerNum(num1: Int, num2: Int): Int {
//        val value = if (num1 > num2) {
//            num1
//        } else {
//            num2
//        }
//        return value
//    }

//    fun largerNum(num1: Int, num2: Int): Int {
//        return if (num1 > num2) {
//            num1
//        } else {
//            num2
//        }
//    }

//    fun largerNum(num1: Int, num2: Int): Int = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }

//    fun largerNum(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

//    fun getScore(name: String) = if (name == "Wonderful") {
//        100
//    } else if (name == "Tome") {
//        86
//    } else if (name == "Jack") {
//        60
//    } else {
//        0
//    }


    //when语句
    fun getScore(name: String) = when (name) {
        "Wonderful" -> 100
        "Tome" -> 86
        "Jack" -> 60
        else -> 0
    }

//    fun getScore(name: String) = when {
//        name.startsWith("Won") -> 100
//        name == "Tome" -> 86
//        name == "Jack" -> 60
//        else -> 0
//    }

//    fun checkNumber(num: Number) {
//        when (num) {
//            is Int -> print("整数") // is 关键字相当于 Java 中的 instanceof 关键字
//            is Double -> print("Double")
//            else -> print("number not support")
//        }
//    }

    //循环语句
    fun cycle() {
        // 遍历[0, 10]中的每一个元素
        for (i in 0..10){
            println(i)
        }
        // 遍历[0, 10)的时候，每次循环会在区间范围内递增2，相当于 for-i 中的 i = i + 2 效果
        // step 关键字可以跳过其中一些元素
        for (i in 0 until 10 step 2){
            println(i)
        }
        // 降序遍历[0, 10]中的每一个元素
        // downTo 关键字用来创建降序的空间
        for (i in 10 downTo 1){
            println(i)
        }
    }



}