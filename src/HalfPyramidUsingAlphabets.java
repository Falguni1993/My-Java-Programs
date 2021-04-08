
public class HalfPyramidUsingAlphabets {

	public static void main(String[] args) {
		char last = 'E', alphabet='A';
		int i,j;
		for (i=1;i<=(last-'A'+1);i++)
	{
			for(j=1;j<=i;j++)
			{
				System.out.println(alphabet +" ");
			}
			++alphabet;
				System.out.println();
			}
	}
		
	}


