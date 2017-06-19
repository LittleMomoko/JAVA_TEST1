import java.util.Scanner;

public class Homework131 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int js = 0;
		int os = 0;
		int sr = s.nextInt();
		
		while (sr != -1)
		{
			if (sr%2 == 0)
			  {
				++os;
			  }
			else
			  {
				++js;
			  }
			sr = s.nextInt();
		 }
		
		System.out.println(js +" "+ os);
	}
}