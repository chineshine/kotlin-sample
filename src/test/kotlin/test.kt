package c.s.sample

import c.s.sample.user.User
import org.junit.Test
import java.lang.RuntimeException

class TestClass {
    @Test
    fun test1() {
        println("this is the test class of test1")
    }

    @Test
    fun test2() {
        val user: User = User().let {
            it.sex = "male"
            it
        }
        user.run {
            validateUser(this)
        }
//        validateUser(User().let {
//            it.sex = "male"
//            it
//        })
    }

    private fun validateUser(user: User) {
        // 本地函数
        fun validate(value: Any?, fieldName: String): Boolean {
            if (value == null) {
                throw RuntimeException("$fieldName is null")
            }
            return true
        }

        validate(user.username, "username")
        validate(user.nickname, "nickname")
//        user.username?.let { validate(it, "username") }
//        user.nickname?.let { validate(it, "nickname") }
    }

    @Test
    fun test3() {
        User().apply {
            // apply 用于调用该对象后,返回对象本身
            this.sex = "female"
            this.hashCode()
        }.let { println(it.sex) }

        with(ArrayList<String>()) {
            // with 用于多次调用某个类中的方法,如 a.f1,a.f2,简写成 with(a){f1 f2}
            // with 返回函数的最后一次调用
            add("kotlin")
            add("java")
//            println(this.size)
            this.size
        }.let { println(it.toString()) }

        User().run {
            this.sex = "male"
            this.nickname = "zhangsan"
            this.age
        }.let {
//        默认返回最后一次调用  也就是 this.age 的值
            println(it)
        }

        User().run {
            // println 默认返回 kotlin.unit
            println("xx")

        }.let { println(it) }
    }

    @Test
    fun test4() {
        converts()
        convertssss()
    }


    @Test
    fun test5() {
        // 具名参数 传值
        showMe(name = "zhangsan", nationality = "汉族")
    }

    private fun showMe(name: String, country: String = "china", nationality: String) {
        println("你好, 我的名字是: $name , 我来自$country, 民族是: $nationality")
    }

    @Test
    fun test6() {
        val arr: List<String> = listOf("zhangsan", "lisi", "wangwu", "zhaoliu")
        println(arr[0])
        println("------------------")
        for (i in arr) {
            println(i)
        }

        println("-----------------------")

        with(arr) {
            this
        }.let {
            println(it)
        }

        println("--------------------")
        for ((index, value) in arr.withIndex()) {
            println("序号: $index, 值: $value")
        }

        println("--------------------")
        for (id: Int in arr.indices) {
//            println("序号: $id, 值: $arr[id]")
            println("序号: $id, 值: ${arr[id]}")
        }
        println("--------------------")
        var n: Int = 1
        println("---------- do..while 循环--------------")
        do {
            println(n)
            n += 1
        } while (n < 4)

        println("--------------while 循环----------")
        while (n < 7) {
            println(n)
            n++
        }
    }
}