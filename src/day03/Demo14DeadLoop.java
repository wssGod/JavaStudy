package day03;

/**
 * @author wss
 * 死循环：永远停不下来的的循环
 * 死循环的标准格式
 *  while(true){
 *      循环体
 *  }
 */
public class Demo14DeadLoop {
    public static void main(String[] args) {
        while(true){
            System.out.println("I Love Java!");
        }

        // System.out.println("Hello"); 这么写是错误的永远访问不到
    }
}
