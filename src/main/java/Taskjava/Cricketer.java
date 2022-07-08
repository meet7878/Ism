package Taskjava;
import java.util.Scanner;

import java.util.Scanner;

class Cricketer{
	int matchplayed,rank;
	String name;
	
	Scanner sc=new Scanner(System.in);
	void getData() {
		System.out.println("Enter name Matchplayed ");
		name=sc.next();
		matchplayed=sc.nextInt();
//		rank=sc.nextInt();
		
	}
	
	void display() {
		System.out.println(name+matchplayed);
		if (matchplayed >=250) {
			System.out.println("rank is 1");
		}
		
		else if (matchplayed >=50) {
			System.out.println("rank is 5");
		}
		
		else if (matchplayed >=100) {
			System.out.println("rank is 3");
		}
		
		else if (matchplayed <50) {
			System.out.println("rank is 100");
		}
		
		
	}
		
	
	
	public static void main(String args[]) {
	Cricketer[] c=new Cricketer[2];
	
	for(int i=0;i<2;i++)
		{
		c[i] = new Cricketer();
			c[i].getData();
		
	
		}
	for(int i=0;i<2;i++)
	{
			c[i].display();
	

	}
		}
}