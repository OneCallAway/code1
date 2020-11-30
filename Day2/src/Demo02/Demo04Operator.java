package Demo02;

/**
 * @program: code
 * @description:赋值运算符
 * @author: ty
 * @create: 2020-11-30 15:13
 *
 * 赋值运算符分为：
 *
 * 基本赋值运算符：就是一个等号，代表将右侧的数据交给左侧的变量
 *      int a = 30;
 * 复合赋值运算符：
 *      +=      a += 1  相当于   a = a + 1
 *      -+      a -= 1  相当于   a = a - 1
 *      *=      a *= 1  相当于   a = a * 1
 *      /=      a /= 1  相当于   a = a / 1
 *      %=      a %= 1  相当于   a = a % 1
 *
 * 注意：只有变量才能使用赋值运算符，常量不能进行赋值
 **/
public class Demo04Operator {
    public static void main(String[] args) {
        int a = 10;
        //a = a + 5;
        //a = 10 + 5;
        //a = 15;
        a += 5;
        System.out.println(a);

        int x = 10;
        x %= 3;
        System.out.println(x);

        byte num = 30;
        //num = num + 5
        //num = byte + int
        //num = int + int
        //num = int
        //num = (byte)int
        num += 5;
        System.out.println(num);
    }
}
