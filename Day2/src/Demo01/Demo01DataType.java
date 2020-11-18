package Demo01;

/**
 * @program: code
 * @description:
 * @author: ty
 * @create: 2020-11-18 16:44
 *
 * 当数据类型不一样的时候，将会发生数据类型转换
 *
 * 自动类型转换（隐性转换）
 *      特点：代码不需要进行特殊处理，自动完成
 *      规则：数据范围从小到大
 * 强制类型转换（现性转换）
 **/
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024);   //整数，默认int类型
        System.out.println(3.14);   //浮点数，默认double类型

        /*
        左边是long类型，右边是默认的int类型，左右数据类型不一样
        一个等号代表赋值，讲右侧的int常量，交给左侧的long变量进行存储
        int --> long,符合了数据范围从小到大的要求，发生了自动类型转换
         */
        long num1 = 100L;
        System.out.println(num1);   //100

        /*
        左边是double类型，右边是float类型，左右不一样
        float --> double,符合从小到大的规则，发生自动类型转换
         */
        double num2 = 3.14F;
        System.out.println(num2);

        /*
        左边是float类型，右边是long类型，左右不一样
        long --> float,符合从小到大的规则，发生自动类型转换
         */
        float num3 = 10L;
        System.out.println(num3);
    }
}
