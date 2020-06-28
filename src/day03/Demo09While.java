package day03;

/**
 * @author wss
 */
public class Demo09While {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            System.out.println("我错了" + i);
        }
        System.out.println("=====================");
        // 1.初始化语句
        int i = 1;
        while (i <= num) {
            System.out.println("我错了" + i);
            i++;
        }
        System.out.println("=====================");
        // do...while
        int j = 1;
        do {
            System.out.println("我错了" + j);
            j++;
        } while (j <= 10);
    }
}
