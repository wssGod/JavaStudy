package day03;

/**
 * @author wss
 * 用循环求出1-100之间的偶数和
 */
public class Demo10 {
    public static void main(String[] args) {
        int num = 100;
        int j = 2;
        int count = 0;
        for(int i = 0; i <= num; i+=j) {
            count += i;
        }
        System.out.println("for1偶数和：" + count);

        int num1 = 100;
        int count1 = 0;
        for (int i = 0; i <= num1; i++) {
            if (i % 2 == 0) {
                count1 += i;
            }
        }
        System.out.println("for2偶数和：" + count1);

        int j1 = 1;
        int count3 = 0;
        while(j1 <= num) {
            if (j1 % 2 == 0) {
                count3 += j1;
            }
            j1++;
        }
        System.out.println("while偶数和：" + count3);

        int j4 = 1;
        int count4 = 0;
        do {
            if (j4 % 2 == 0) {
                count4 += j4;
            }
            j4++;
        } while(j4 <= num);
        System.out.println("do...while偶数和：" + count3);
    }
}
