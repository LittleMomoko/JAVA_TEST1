
import java.util.Scanner;

public class Homework111 {

	public static void main(String[] args) {
        //华氏温度
		int f;
		//摄氏温度
        int c;
        //输入摄氏度
        @SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
        f = t.nextInt();
        
//       °F = (9/5)*°C + 32
        c = (int)((f-32)/1.8);
        System.out.println(c);
	}

}