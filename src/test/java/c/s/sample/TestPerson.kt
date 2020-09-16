package c.s.sample

import c.s.sample.person.*
import org.junit.Test

class TestPerson {

    @Test
    fun test1() {
        var person: Person = Person("zhangsan")

//        构造体内未声明参数是没有 get/set 方法, 也无法直接使用其参数
//        person.getName()
    }

    @Test
    fun test2() {
        var p2: Person2 = Person2("zhang", "san")
//        构造体内声明的参数  可以在外部直接调用
        println("${p2.firstname} ${p2.lastname}")
//         字符串中用复杂el表达式需要大括号


        var p3: Person3 = Person3("li", "si")
//        构造体内的声明的参数   如果使用 private 修饰符  则外部无法访问
//        p3.lastname

        var p4: Person4 = Person4("wang", "wu")
        println(p4.getFirstname())

        var p5:Person5 = Person5("zhangsan")
        println(p5.name)
    }

}