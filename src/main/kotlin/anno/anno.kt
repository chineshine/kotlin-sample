package c.s.sample.anno

@Target(AnnotationTarget.ANNOTATION_CLASS) // 注解作用域  类 函数  属性  表达式
@Retention(AnnotationRetention.RUNTIME)  // 作用在class的哪个某个生命周期
//@Repeatable 可多次注解
@MustBeDocumented  // 文档
annotation class MyAnno{


}