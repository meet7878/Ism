////11.Write a do-while loop that asks the user to enter two numbers. The numbers
////should be added and the sum displayed. The loop should ask the user whether
////he or she wishes to perform the operation again. If so, the loop should repeat;
////otherwise it should terminate.


import java.util.Scanner;

class Do{
	 
	public static void main(String args[]) {
   int sum;
		
		do {
			
			
			System.out.println("Enter first num");
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			
			System.out.println("Enter second num");
			Scanner second = new Scanner(System.in);
			int b = second.nextInt();
			
			sum= a+b;
			System.out.println("sum is two number"+sum);
			
			System.out.println("Enter the choice");
			Scanner ch =new Scanner(System.in);
			int jump =ch.nextInt();
			if(jump==1) {
				System.out.println("Enter first num");
				Scanner fc = new Scanner(System.in);
				int c=fc.nextInt();
				
				System.out.println("Enter second num");
				Scanner sec = new Scanner(System.in);
				int d = sec.nextInt();
				
				sum= c+d;
				System.out.println("sum is two number"+sum);
	        }
			else if(jump==2) {
			System.out.println("Exit");
			}
			
			else {
				System.out.println("break");
			}
//			Scanner ex = new Scanner(System.in);
//	        int flag=ex.nextInt();	
//	        if(flag==2) {
//	        	System.out.println("break");
//	        }
	 
		}while(true);
			
			
		}
	}
	        
			
			
//			switch(operater) {
//			case 1:
//				
//			
//				
//				break;
//			
//			case 2:
//				System.out.println("break");
//				break;
//				
//			default:
//				System.out.println("Invalid");
//			    break;
//			
//			}
//  			
//		}
		
