import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
    	double inch,meter;
        System.out.println("please enter the value inches=");
    	Scanner sc = new Scanner(System.in);
    	inch=sc.nextDouble();
    	
    	meter=inch/39.37;
    	
    	System.out.println("meter are:" + meter );
    	
    	
    }
}