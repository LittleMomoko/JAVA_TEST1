
import java.util.Scanner;

public class Homework121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int btj = 0;
		int utc = 0;
		// ���뱱��ʱ��
		btj = new Scanner(System.in).nextInt();
		//ת��
		if (btj < 800)
		{
			utc = btj - 800 + 2400;
		}
		else
		{
			utc = btj - 800;
		}
		//�������ʱ��
		System.out.println(utc);
	}
}