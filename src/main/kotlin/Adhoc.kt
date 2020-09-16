package c.s.sample

import java.io.BufferedReader
import java.util.*

/**
 * 表达式: kotlin 中除了循环语句(for, while, do...while),其余都是表达式
 * 语句: 循环体(for, while, do...while)
 */

/**
 * var 与 val 的区别
 * var(variable) => 变量, 会自动装配 get/set 方法
 * val(value) => 常量 只会装配 get 方法
 */

class Adhoc {
    var x = 3;
    val y = 4;
    fun max(a: Int, b: Int): Int {
        // kotlin 无三目表达式, 可用 if/else 替代
        return if (a > b) a else b;
    }

    // function 也可使用表达式
    fun min(a: Int, b: Int) = if (a > b) b else a;

    fun read(reader: BufferedReader) {
        // try 表达式
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            // null
        }
        println(number)
    }

    fun testType(obj: Any) {
        if (obj is String) println("it is the type of string")
        // when 表达式 类似 switch
        when (obj) {
            is Integer -> println("it is integer")
            is Boolean -> println("it is boolean")
        }
    }

    var wuxingNum: Int = 0;

    // when 表达式
    // the when function is equal to switch in java
    fun wuxing() = when (wuxingNum) {
        1 -> println("金")
        2 -> println("木")
        3, 4 -> println("水")
        5 -> println("火")
        6, 7, 8 -> println("土")
        else -> throw RuntimeException("不在五行中")
    }

    // 扩展方法 , 也可以使用 var/val 扩展属性
    // 可扩展一个类中没有的方法
    fun String.firstUp(): String = StringBuilder().append(this.first().toUpperCase()).append(this.subSequence(1, this.length)).toString();

    // 也可扩展已有方法, 等同于方法重载
    fun String.lastOf(): Char = this[this.length - 1];

    // 可变长度参数
    fun listString(vararg str: String): List<String> {
        // 使用 * 号来展开数组的变量
        return listOf(*str)
    }
}

// 此种写法相当于直接定义了构造器,没有无参构造
class Adhoc2(private val a: Int, private val b: Int) {
    // 该属性可被设置
    var min = if (a > b) b else a;

    // 该属性不可被重新设置
    val max: Int
        // 重写 get() 方法
        get() = if( a > b) a else b;
        // get() = 999

    val isEqual: Boolean
        get() {
            // 重写 get() 方法
            return a == b;
        }
}

// 此处用 val 代表定义了值后,不可修改
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238)
    ; // 枚举需要分号结尾, 等同 java

    fun rgb() = (r * 256 + g) * 256 + b
}