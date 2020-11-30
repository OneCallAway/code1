package Demo01;

/**
 * @program: code
 * @description:
 * @author: ty
 * @create: 2020-11-30 10:02
 * 数字和字符的对照关系表（编码表）:
 *
 * ASCII码表:美国信息交换标准代码
 * Unicode码表:万国码,也是数字和符号的对照关系，0~127和ASCII一样，从128开始包含更多字符
 **/
public class Demo03DataTypeChar {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0);

        char zifu2 = 'A';
        System.out.println(zifu2 + 0);

        char zifu3 = 'c';
        //左侧是int类型，右边是char类型
        //char --> int 从小到大
        //发生自动转换
        int num = zifu3;
        System.out.println(num);

        char zifu4 = '中';
        System.out.println(zifu4 + 0);//20013
    }
}
