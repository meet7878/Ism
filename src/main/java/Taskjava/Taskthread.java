package Taskjava;

import java.io.IOException;

 class TestMultitasking3  implements Runnable  {
	 int sum = 0;	
		public void run()  {
			try {
			for(int i=1;i<=100;i++)
			{
				sum=sum+i;
			}
			Thread.sleep(1000);
			System.out.println(sum);
		}
		catch(Exception e){
		System.out.println("Error");
		
	}
		}
}
class Taskthreads implements Runnable  {
			 static int sum1 = 0;	
				public void run()  {
					try {
					for(int i=1;i<=50;i++)
					{
						sum1=sum1+i;
					}
					Thread.sleep(1000);
					System.out.println(sum1);
				
				}	
				catch(Exception e){
				System.out.println("Error");
			}
				}
 }	


class Task extends Taskthreads  implements Runnable  {
	 int sum2 = 0,sum3;	
		public void run()  {
			try {
			for(int i=51;i<=100;i++)
			{
				sum2=sum2+i;
			}
			Thread.sleep(1000);
			System.out.println(sum2);
			sum3=sum1+sum2;
			System.out.println(sum3);
			
		}	
		catch(Exception e){
		System.out.println("Error");
	}
		}
}	


	class Taskthread{			
	public static void main(String args[])  {
		TestMultitasking3  t =new TestMultitasking3 ();
		t.run();
		Taskthreads t2 =new Taskthreads();
		t2.run();
		
		Task t3 = new Task();
	    t3.run();
	}
	}