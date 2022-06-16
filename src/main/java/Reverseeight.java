//8.Write a program to reverse a 3-digit number.

import java.util.Scanner;

class Reverseeight{
	public static void main(String args[]) {
		int result;
		
    	System.out.println("Enter the value=");
		Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
		
		while(num>0) {
			result = num%10;
			System.out.println("Revrse num are:="+result);
			num=num/10;
			
		}
		
	}
}