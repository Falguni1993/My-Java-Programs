
public class TestJava2 {

	 int i = 10;
	static int j = 50;
	
	public static void main(String[] args) {
		TestJava2 T1 = new TestJava2();
		
		System.out.println(TestJava2.j);
		System.out.println(T1.i);
		non_static();
		
		
		
	}
public static void non_static()
{
System.out.println("pass");
}
}
