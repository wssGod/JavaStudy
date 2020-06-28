package day03;

/**
 * @author wss
 *
 * 三种循环的区别
 *  1.如果条件判断重来没有满足过，那么for和while执行0次，do...while至少执行1次。
 *  2.for循环小括号中的变量只能内部使用，while和do...while的循环初始化语句在外面，所以循环之后可以继续使用。
 */
public class Demo11LoopDifference {
    public static void main(String [] args){
        for (int i = 1; i < 0; i++) {
            System.out.println("Hello");
        }
        // System.out.println(i); 这是一个错误的写法，i只有循环内才能使用
        int i = 1;
        do {
            System.out.println("Word");
        } while(i < 0);
        // 仍然可以使用
        System.out.println(i);
    }
}
