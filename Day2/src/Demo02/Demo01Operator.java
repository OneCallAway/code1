package Demo02;

/**
 * @program: code
 * @description:
 * @author: ty
 * @create: 2020-11-30 10:44
 *
 * 运算符：进行特定操作的符号
 * 表达式：用运算符连起来的式子叫做表达式
 *
 * 四则运算：加减乘除
 * 对于一个整数的表达式来说，除法用的是整数，整数除以整数，结果仍然是整数，只看商不看余数
 * 只有对于整数的除法来说，取模运算符才有余数的意义
 * 注意：
 * 1.一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种
 **/
public class Demo01Operator {
    public static void main(String[] args) {
        //二个常量之间进行数学运算
        System.out.println(20 + 30);

        //二个变量之间进行数学运算
        int a = 20;
        int b = 30;
        System.out.println(a - b);

        //变量和常量之间可以混合使用
        System.out.println( a * 10);

        int x = 10;
        int y = 3;
        int result1 = x / y;
        System.out.println(result1);//3

        //取模
        int result2 = x % y;
        System.out.println(result2);//1

        //int + double --> double + double --> double
        double result3 = x + 2.5;
        System.out.println(result3);



    }
}