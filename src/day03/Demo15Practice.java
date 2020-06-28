package day03;

/**
 * @author wss
 * 打印5*8的矩阵
 */
public class Demo15Practice {
    public static void main(String [] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
