package Demo02;

/**
 * @program: code
 * @description: 逻辑运算符
 * @author: ty
 * @create: 2020-12-02 14:56
 * 与(并且)：&&     全真才为真（true），一真一假false
 * 或(或者)：||     至少一个为真，就是true;全都是false，才是false
 * 非(取反)：!      本来是true，变成false;本来是false，变成true
 *
 * 与“&&”，或“||”，具有短路效果，如果根据左边已经可以判断得到最终结果，那么右边的代码将不再执行，从而节省一定的性能
 *
 * 1:逻辑运算符只能用于boolean值
 * 2:与、或需要左右各自有一个boolean值，但是取反只要有唯一的一个boolean值即可
 * 3:与、或二种运算符，如果有多个条件，可以连续写
 * 二个条件：条件A && 条件B
 * 多个条件：条件A && 条件B && 条件C
 *
 * 如果是1 < x < 3,使用逻辑运算符连接
 * int x = 2；
 * 1 < x && x < 3
 **/
public class Demo06Logic {
    public static void main(String[] args) {
        System.out.println(true && false);//false
        System.out.println(3 < 4 && 10 > 5);//true

        System.out.println(true || false);//true
        System.out.println(true || true);//true
        System.out.println(false || false);//false

        System.out.println(!true);


        int a = 10;
        System.out.println(3 > 4 && ++a < 100);
        System.out.println(a);

        int b = 20;
        System.out.println(3 < 4 || ++b < 100);
        System.out.println(b);

        
    }
}
