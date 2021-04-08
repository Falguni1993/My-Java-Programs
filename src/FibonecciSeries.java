
public class FibonecciSeries {

	public static void main(String[] args) {
		int sum;
		int a=0;
		int b=1;
		int i;
		System.out.print(a+" "+b);

		for (i=0;i<10;i++)
		{
			sum = a+b;
			System.out.print(" "+ sum);
			a=b;
			b=sum;
			
		}
	}

}
