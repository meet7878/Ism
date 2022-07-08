package Taskjava;

import java.util.Scanner;

class MobileContact {

	String fname, lastname;
     int number, Choice;
	int arr1[] = new int[2];
	 static int count = 0;
	static int i=0;
	static Scanner sc = new Scanner(System.in);
	 MobileContact mb[] = new MobileContact[10];

	 void Add_contact() {
		

		
		  System.out.println("Enter first Name :  ");
		  fname=sc.next();
		  
		  System.out.println("Enter Last Name :  "); 
		  lastname=sc.next();
		  
		  System.out.println("Enter Contact Number : ");
		  number=sc.nextInt();
		 count++;

		

	}
	 
	 void Edit_contact(String search) {
		 for (int i = 0; i < count; i++) {
		 if(search.equals(mb[i].fname)) {
			  System.out.println("1: change firstname");
		        System.out.println("2: change lastname");
		        System.out.println("3: change Contact");
		        int y =sc.nextInt();
		        
		        switch (y) {
	            case 1:
	                System.out.println("Firstname");
	                mb[i].fname = sc.next();
	                break;
	            case 2:
	                System.out.println("Lasttname");
	                mb[i].lastname = sc.next();
	                break;
	            case 3:
	                System.out.println("contact number");
	                mb[i].number = sc.nextInt();
	                break;
	            default:
	                System.out.println("please enter vailid choice");
	                Edit_contact(search);
	                break;
	        }
	    }
	            else {
	            	System.out.println("Data not found");
	            }
	    }
			 
		 }
	 
	 void Search_contact(String name) {
         for (int i = 0; i < count; i++) {
             if (name.equals(mb[i].fname)) {
                 System.out.println(mb[i].fname + " " + mb[i].lastname + " " + mb[i].number);
             }
         }
 }

	 
	 

//	 void show()
//
//	{
//		for (int i = 0; i <count ; i++) {
//
//			System.out.println("Fname  " + mb[i].fname + "lastname : " + mb[i].lname + "Mobile :  " + mb[i].Number);
//		}
//
//	}

	void modify() {

	}

	void choice() {

		while (true) {
			System.out.println("1.Add new contact");
			System.out.println("2.Edit Contact");
			System.out.println("3.Search contact");
			System.out.println("4.remove contact");
			System.out.println("5.Exit from App");

			Scanner sc = new Scanner(System.in);
			System.out.println("Choice 1 operation");
			int Choice = sc.nextInt();

			switch (Choice) {
			case 1:

				 mb[i] = new MobileContact();
                 mb[i].Add_contact();
                 i++;
                 break;
				
			case 2:
                System.out.println("please enter the first name of contact you change");
                String search = sc.next();
                Edit_contact(search);
                break;
                
			case 3:
                System.out.println("please enter the first name of contact you want to search");
                String name = sc.next();
                Search_contact(name);
                break;

			}

		}

	}


public static void main(String[] args) {
	MobileContact s = new MobileContact();
    s.choice();
}
}