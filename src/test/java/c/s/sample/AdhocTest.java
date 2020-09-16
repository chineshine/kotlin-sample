package c.s.sample;

import org.junit.Test;

public class AdhocTest {

    @Test
    public void test1() {
        Adhoc test = new Adhoc();
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

        // top level function
        Converters.converts();
    }
}
