import java.util.Scanner;

class Arrayindex{
	public static void main(String ar[])
	{
		System.out.println("Enter total Array size");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[] number = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element");
			number[i]=sc.nextInt();
			
			
		}
		int i=0;
		for(int var : number) {
			System.out.println("number["+ i +"]=" + var);
			i++;
		}
	}
}