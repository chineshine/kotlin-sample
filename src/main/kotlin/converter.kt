// define the top level classname
// if not define it, the classname in jvm will be named Converterkt
@file:JvmName(name = "Converters")
// 默认类名 ConverterKt

package c.s.sample

fun converts(){
    println("this is the top level function,it is equal to the static-function in java")
}

@JvmName(name="converts2")
fun convertssss(){
    println("test the jvmname ")
}

@set:JvmName(name = "setFieldName1")
@get:JvmName(name="getFieldName1")
var field1: String = "ssss"