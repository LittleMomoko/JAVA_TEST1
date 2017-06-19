
import java.util.Scanner;

public class Homework121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int btj = 0;
		int utc = 0;
		// 输入北京时间
		btj = new Scanner(System.in).nextInt();
		//转换
		if (btj < 800)
		{
			utc = btj - 800 + 2400;
		}
		else
		{
			utc = btj - 800;
		}
		//输出世界时间
		System.out.println(utc);
	}
}