package com.lsw.demo.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        testPerson()
    }

    fun testPerson() {
        val p = Person()
        p.name = "Wonderful"
        p.age = 18
        p.eat()
    }

    fun testStu(){
        val s = Student()
        s.sno = "123"
        s.grade = 6
    }

    fun testStu2(){
        val student1 = Student2()
        val student2 = Student2("Wonderful", 18)
        val student3 = Student2("no123", 6, "Wonderful", 18)
    }

    fun testInterface() {
        val student = Student2("no123", 6, "Wonderful", 18)
        doStudy(student)
    }

    fun doStudy(study: Study){
        study.readBooks()
        study.doHomework()
    }

}