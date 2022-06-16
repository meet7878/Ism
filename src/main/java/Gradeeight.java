//8.The total number of students in a class are 90 out of which 45 are boys. If 50%
//of the total students secured grade 'A' out of which 20 are boys, then write a
//program to calculate the total number of girls getting grade 'A'.

class Gradeeight{
	public static void main(String args[]) {
		
		
		int a = 90*50/100;
		int boys=20;
		System.out.println("A Grade All Student"+a);
		
		int c=a-boys;
		System.out.println("A grade Girls"+c);
	}
}
