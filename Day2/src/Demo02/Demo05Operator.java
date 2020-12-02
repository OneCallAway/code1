package Demo02;

/**
 * @program: code
 * @description:比较运算符
 * @author: ty
 * @create: 2020-12-01 14:12
 *
 * 1:比较运算的结果一定是一个boolean值，成立是true，不成立就是flase
 * 2:如果进行多次判断，不能连这写
 *      1 < x < 3
 **/
public class Demo05Operator {
    public static void main(String[] args) {
        System.out.println(10 > 5);

        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 < num2);

        System.out.println(num2 >= 100);
        System.out.println(num2 <= 100);
        System.out.println("+++++++++++++++++++++++++++");

        System.out.println(10 == 10);
        System.out.println(20 != 10);
        System.out.println(20 != 20);
    }
}
