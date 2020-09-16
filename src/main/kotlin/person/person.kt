package c.s.sample.person

import c.s.sample.user.UserService
import com.google.inject.Inject

class Person(name: String) {
    //此处 name 未声明, 无法在全局使用

    // 类似 java 中的 {}
    init {
        // 构造体未声明, init 里面可以调用
        var length = name.length
    }

    fun getPersonName(): String {
//        构造体未声明, name无法在方法体内调用
//        return name
        return "zhangsan"
    }
}

class Person2(var firstname: String, lastname: String) {
    // 通过在内部声明, 可以全局使用该变量
    var lastname = lastname

    fun getName(): String {
        return firstname + lastname
    }
}

class Person3(private var firstname: String, private val lastname: String) {

    // 此处变量可以在字符串中 用 el 表达式直接使用
    fun getName() = "$firstname $lastname"
}


class Person4(private var firstname: String, private val lastname: String) {
    //    var firstname = firstname   无法重复声明
    fun getFirstname(): String = firstname
}

class Person5(name: String) {
    var name = name
        get() = name
}


class Person6 {
    //     主构造函数  没有或只有一个
    constructor() {}

    //    次构造函数  可以有多个
    constructor(name: String) : this() {
// 次构造函数参数不能声明  即不能使用 val var
    }

    constructor(name: String, age: Int) : this(name) {
//        次构造函数必须直接(如上)或间接委托给主构造函数
    }
}

// 依赖注入的构造体
class Person7 @Inject constructor(userService: UserService) {

}