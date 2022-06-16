

import java.util.Scanner;
  
class Decimal 
{

    // function to convert decimal to binary
    public static void main (String[] args) 
    {
        int n;
        
        System.out.println("please enter the decimal value=");
    	Scanner sc = new Scanner(System.in);
    	n=sc.nextInt();
       
        int[] binaryNum = new int[1000];
   
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
   
       
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
      
    
    
}

