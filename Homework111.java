
import java.util.Scanner;

public class Homework111 {

	public static void main(String[] args) {
        //�����¶�
		int f;
		//�����¶�
        int c;
        //�������϶�
        @SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
        f = t.nextInt();
        
//       ��F = (9/5)*��C + 32
        c = (int)((f-32)/1.8);
        System.out.println(c);
	}

}