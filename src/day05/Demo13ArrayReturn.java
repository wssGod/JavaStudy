package day05;

/**
 * Demo13ArrayReturn
 *
 * @author wss
 * @date 2020/6/30 1:40 下午
 * 一个方法可以有0，1多个参数，但是只能有0或1个返回值，不能有多个返回值
 * 如果希望一个方法中产生了多个结果数据进行返回，怎么办？
 *  解决方案：使用一个数组作为返回值的类型即可
 *
 *  任何数据类型都能作为方法的参数类型，或者返回值类型。
 *  数组作为方法的参数，传递进去的其实是数组的地址值。
 *  数组作为方法的返回值，返回的其实也是数组的地址值。
 */
public class Demo13ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println(result[0]);
    }
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum/3;
        // 两个结果都想返回
        // 需要一个数组，进行保存多个结果
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;
    }
}
