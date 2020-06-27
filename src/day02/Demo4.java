package day02;

/**
 * Demo4
 *
 * @author wss
 * @date 2020/6/23 4:04 下午
 *
 * 自增运算符: ++
 * 自减运算符: --
 *  基本含义: 让一个变量涨一个数字1，或者让一个变量降一个数字1
 *  使用格式：写在变量名之前，或者写在变量名称之后，例如: ++num， num++
 *  使用方式:
 *      1. 单位使用: 不和其他任何操作混合，自己独立成为一个步骤。
 *      2. 混合使用: 和其它操作混合，例如与赋值混合，或者打印操作混合
 *  使用区别:
 *      1. 在单独使用的时候，前++和后++没有任何区别。
 *      2. 在混合使用的时候，有【重大区别】
 *          A: 如果是前++，那么立刻马上+1，然后拿着结果进行使用。[先加后用]
 *          B: 如果是后++，那么首先使用变量本来的数值，然后再让变量+1。【先用后加】
 *  注意事项：
 *      只有变量才能使用自增、自减运算符，常量不可发生改变，所以不能用
 */
public class Demo4 {
    public static void main(String [] args){
        int num1 = 10;
        // 结果: 10
        System.out.println(num1);
        ++num1; // 单独使用，前++
        // 结果: 11
        System.out.println(num1);
        num1++; // 单独使用 后++
        // 结果: 12
        System.out.println(num1);
        System.out.println("=====================");
        // 与打印操作混合的时候
        int num2 = 20;
        // 混合使用，先++，变量立马变成21，然后打印结果21
        // 结果: 21
        System.out.println(++num2);
        System.out.println(num2);
        System.out.println("=====================");

        int num3 = 30;
        // 混合使用， 后++， 首先使用变量本来的30，然后再让变量+1得到31
        // 结果: 30
        System.out.println(num3++);
        // 结果: 31
        System.out.println(num3);
        System.out.println("=====================");

        int num4 = 40;
        // 和赋值操作混合
        // 混合使用，前--，变量立马-1变成39， 然后将结果赋值给result1
        int result1 = --num4;
        // 结果: 39
        System.out.println(result1);
        // 结果: 39
        System.out.println(num4);
        System.out.println("=====================");

        int num5 = 50;
        // 混合使用，后--，首先将本来的数字50交给result2使用，然后自己-1变成49
        int result2 = num5--;
        // 结果: 50
        System.out.println(result2);
        // 结果: 49
        System.out.println(num5);
        System.out.println("=====================");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        // 结果: 31
        System.out.println(result3);
        // 结果: 11
        System.out.println(x);
        // 结果: 19
        System.out.println(y);

        // 30++ // 错误写法
    }
}
