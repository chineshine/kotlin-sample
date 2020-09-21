package c.s.sample;

import org.junit.Test;

public class AdhocTest {

    @Test
    public void test1() {
        Adhoc test = new Adhoc();
        test.getY();

        int maxValue = test.max(3, 4);
        int minValue = test.min(3, 4);
        System.out.println("max value is : " + maxValue + ", min value is " + minValue);
        System.out.println(test.getX());
        test.setX(9);
        System.out.println(test.getX());
        System.out.println("常量Y的值:" + test.getY());

        test.setWuxingNum(4);
        test.wuxing();
        String text = test.firstUp("kotlin");
        System.out.println("kotlin 首字母大写: " + text);
        char tex2 = test.lastOf("kotlin");
        System.out.println("kotlin 最后一个字符是: " + tex2);

        Adhoc2 test2 = new Adhoc2(3,4);
        System.out.println(test2.getMin());

        test.showMe("zhangsan","china","han");

    }


    @Test
    public void test2(){
        // top level function
        Converters.converts();
        Converters.converts2();
        Converters.setFieldName1("xxxx");
        System.out.println(Converters.getFieldName1());

        StaticClass ss = new StaticClass();
        System.out.println(ss.name);

        //name2 有 set()/get() 方法
        ss.setName2("lllll");
        System.out.println(ss.getName2());


        System.out.println(StaticClass.name3);
        System.out.println(StaticClass.getNickname());
        System.out.println(StaticClass.getName4());


        StaticClass2 ss2 = new StaticClass2();
        System.out.println(StaticClass2.Companion.getName());
        System.out.println(StaticClass2.Companion.getNickname());
    }
}
