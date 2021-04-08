
public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Before Swapping");
		int a=10;
		int b=20;
		System.out.println("value of a :" + a);
		System.out.println("value of b :" + b);
		System.out.println("After Swapping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a :" + a);
		System.out.println("value of b :" + b);
        
	}

}
