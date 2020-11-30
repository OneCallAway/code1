package Demo01;

/**
 * @program: code
 * @description:
 * @author: ty
 * @create: 2020-11-18 17:34
 *
 * 强制类型转换
 *      特点：代码需要进行特殊的格式处理，不能自动完成
 *      格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的数据
 *
 * 注意事项
 *      1.强制类型转换不推荐使用，会发生精度损失，数据溢出
 *      2.byte/short/char这三种类型都可以发生数学运算
 *      3.byte/short/char这三种类型在运算的时候，会被首先提升为int类型，然后进行计算
 *      4.boolean类型不能发生数据转换
 *
 **/
public class Demo02DataType {
    public static void main(String[] args) {

        /*
        左边是int类型，右边是long类型
        long --> int,不是从小到大，不能发生自动类型转换
         */
//        int num = 100L;
        int num = (int) 100L;
        System.out.println(num);

        //long强制转换为int类型
        int num2 = (int) 6000000000L;
        System.out.println(num2);

        //double --> int 强制转换类型
        int num3 = (int) 3.1415;
        System.out.println(num3);

        //ASCII表
        //计算机的底层会用一个数字（二进制）来代表字符
        //一旦char类型进行了数学运算，那么字符就会按照一定的规划翻译成一个数字
        char zifu1 = 'A';   //65
        System.out.println(zifu1 + 1);  //66
        char zifu2 = 'b';
        System.out.println(zifu1 + zifu2);

        

        byte num4 = 40;
        byte num5 = 50;
        //byte + byte --> int + int --> int
        int result1 = num4 + num5;
        System.out.println(result1);
        System.out.println(num4 + num5);

        short num6 = 60;
        //byte + short --> int + int --> int
        //int强制转换为short，要保证逻辑上的真实大小没有超过short范围，否则会出现数据溢出
        short result2 = (short) (num4 + num6);
        System.out.println(result2);
    }
}
