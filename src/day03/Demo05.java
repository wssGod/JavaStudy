package day03;

/**
 * Demo05
 *
 * @author wss
 * @date 2020/6/28 10:35 上午
 */
public class Demo05 {
    public static void main(String[] args) {
        int score = 100;
        if (score < 0 || score > 100) {
            System.out.println("你的成绩是错误的");
        } else if (score >= 90 && score <= 100) {
            System.out.println("你的成绩属于优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("你的成绩属于好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("你的成绩属于良");
        } else if (score >= 60 && score <= 69) {
            System.out.println("你的成绩属于及格");
        } else {
            System.out.println("你的成绩属于不及格");
        }
    }
}
