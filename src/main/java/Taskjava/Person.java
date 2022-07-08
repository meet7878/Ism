package Taskjava;
import java.util.Scanner;

class Person{
	private String firstName,lastName,gender;
	static int salary;
	int Increment;
	int arr1[]=new int[2];
	
	  Person() {
		  salary=10000;  
	}
	
       void detail() {
        	 
    	 
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr1.length;i++)
 		{
      
		System.out.println("Enterf first name");
		firstName=sc.next();
		
		System.out.println("Enterf lastt name");
		lastName=sc.next();
		
		System.out.println("Enterf gender name");
		gender=sc.next();
		
		System.out.println("Enterf Increment");
		Increment=sc.nextInt();
		Increment=Increment+salary;
		
         }
         
	}
        void show() {
        	System.out.println("FirstName"+"lastName"+"gender");
        	 for(int i=0;i<arr1.length;i++) {
        		 System.out.println(firstName+"\t"+lastName+"\t"+gender+"\t"+Increment);
        	 }
       	 
       }
        
//        void max() {
//        	for(int i=0;i<arr1.length;i++) {
//        		
//        	}
//        }
//         
	public static void main(String args[]) {
		Person d =new Person();
		d.detail();
		d.show();	
	}
}
