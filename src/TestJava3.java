
public class TestJava3 {

	int i;
	static int j;
	
	public static void main(String[] args) {
		TestJava3 t = new TestJava3();
		t.i=100;
		j= 200;
	
		int j = 500;
		System.out.println(t.i);
		System.out.println(TestJava3.j);
	
		
		
		t.non_static();
		meth_static2();
		}
		
		public void non_static(){
			System.out.println("pass1");
			
		}
		public static void meth_static2(){
			System.out.println("pass1");
			
		}
		

		
		

	}


