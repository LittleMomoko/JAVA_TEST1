import java.util.Scanner;

public class Homework134 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean isFu = false;
		int n = s.nextInt();
		
		String[] py = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","fu"};
		int [] ys = new int[6];

		if (n<0)
		{
			isFu = true;
		}

		int temp = Math.abs(n);
		int x=0;
		do
		{
			ys[x] = temp % 10;
			x++;
			temp = temp / 10;
		} while(temp != 0);

		if (isFu)
		{
			System.out.print(py[10]+ " ");
		}

		for(int y = 0 ; y < x; y++)
		{
			System.out.print(py[ys[x-y-1]]);
			if (y != x-1)
			{
				System.out.print(" ");
			}
		}		
	}
}