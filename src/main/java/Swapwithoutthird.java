import java.util.*;  
class Swapwithoutthird   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
       
        /*Define variables*/  
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y;  //10+20=30  so x=30
        y = x - y;   //30-20=10 so  y=10
        x = x - y;  //x=30-10 so x=20 
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  