import java.util.Scanner;

public class Homework133 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int count = 0;
		int sum = 0;
		boolean isOK = true;
		
		isOK = true;
		for (int j=2 ; j<10000; j++)
		{
			isOK = true;
			for (int k = 2; k<j; k++)
			{
				if (j%k == 0)
				{
					isOK = false;
					break;
				}
			}
			if (isOK) 
			{
				count = count + 1;
				if ((count >= n) && (count<= m))
				{
					sum = sum +j;
				}
			}
		}
		System.out.println(sum);
	}
}