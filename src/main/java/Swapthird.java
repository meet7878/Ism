import java.util.Scanner;

class Swapthird{
	public static void main(String arg[]) {
		
		int a,b,c;
		
		System.out.println("Enter First num");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Enter second num");
		Scanner mc = new Scanner(System.in);
		b = mc.nextInt();
	
	   c=a;
	   a=b;
	   b=c;
	   
	   System.out.println("Swapping two value using third variable"+a+ " "+b );
	   
	}
}