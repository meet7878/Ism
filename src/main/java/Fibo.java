class Fibo{
	public static void main(String arg[]) {
		
		int n=10,i,first=0,second=1;
		 System.out.println("Fibonacci Series till " + n + " terms:");
		
		for(i=1;i<=n;i++) {
			
			System.out.print(first + ", ");
			
			int temp= first+second;//0+1=1,1+1=2
			first=second;//1=1,1
			second=temp;//1,2
			
		}
	}
}