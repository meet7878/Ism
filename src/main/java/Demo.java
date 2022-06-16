import java.util.*;

 class Employee{
	String Employee_name;
	float Salary,tax;
	
       void run(){
		System.out.println("Enter Emp Name:");
		Scanner sc = new Scanner(System.in);
		Employee_name = sc.next();
		
		System.out.println("Enter Salary:");
		Scanner sal = new Scanner(System.in);
		Salary = sal.nextFloat();
		
		
		System.out.println("Employee Name Is "+Employee_name+" And Salary Is "+Salary);
		
	
	}

}
 public class Demo extends Employee{
	public static void main(String arg[]) {
		
		Employee Em = new Employee();
		Em.run();
	}
}