package Demo02;

/**
 * @program: code
 * @description:
 * @author: ty
 * @create: 2020-11-30 14:38
 *
 * 自增运算符：++
 * 自减运算符：--
 *
 * 含义：让一个变量涨一个数字1，或者让一个变量降一个数字1
 * 使用格式：写在变量名称之前，或者写在变量名称之后，++num，num++
 * 使用方式：
 *  1.单独使用：不和其他任何操作混合，自己独立成为一个步骤
 *  2.混合使用：和其他操作混合，比如和赋值混合，或者与打印操作混合
 * 使用区别：
 *  1.在单独使用的时候，前++和后++没有任何区别，
 *  2.在混合使用的时候，
 *      A.如果是前++，这个变量立刻马上加1，然后拿着结果进行使用，先加后用
 *      B.如果是后++，首先使用变量本来的数值，然后再让变量加1，先用后加
 *
 *  只有变量才能使用自增、自减运算符，常量不可发生改变
 **/
public class Demo03Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        ++num1;
        System.out.println(num1);//11
        num1++;
        System.out.println(num1);//12
        System.out.println("++++++++++++++++++++++++++++++++");

        //混合使用
        int num2 = 20;
        //前++，变量立马变成21，然后打印输出21
        System.out.println(++num2);//21
        System.out.println(num2);//21
        System.out.println("+++++++++++++++++++++++++++");

        int num3 = 30;
        //后++，首先使用变量本来的30，然后在让变量+1得到31
        System.out.println(num3++);//30
        System.out.println(num3);//31
        System.out.println("+++++++++++++++++++++");

        int num4 = 40;
        //前--，变量立马减1，然后把结果39交给result变量
        int result1 = --num4;
        System.out.println(result1);//39
        System.out.println(num4);//39
        System.out.println("++++++++++++++++++++");

        int num5 = 50;
        //后--，先把数字50交给result变量，然后自己在减1
        int result2 = num5--;
        System.out.println(result2);
        System.out.println(num5);
        System.out.println("++++++++++++++++++++");

        int x = 10;
        int y = 20;
        //11 + 20 = 31
        int result3 = ++x + y--;
        System.out.println(result3);//31
        System.out.println(x);//11
        System.out.println(y);//19
    }
}
