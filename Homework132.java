import java.util.Scanner;

public class Homework132 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int zs = s.nextInt();
		int x = zs;
		int y = zs;
		int z = 0;
		int n = 0;
		int m = 0;
		do{
			x = y%10;
			y = y/10;
			z++;
			if (z==1)
			{
				m =1;
			}
			else
			{
				m = m *2;
			}
			
			if(((z%2 == 0) && (x%2==0)) || ((z%2 != 0) && (x%2 != 0)))
			{
				n =  n + m;
			}
		} while (y != 0);
		
		System.out.println(n);

	}
}