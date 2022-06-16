//17.Write a Java program to find the maximum and minimum value of an array.
import java.util.*;
public class Minmax
{
  public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[]{1,2,3,4,5};
       
       int min = arr[0];
       int max = arr[0];

       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]<min)
           {
           min=arr[i];
           }
         if(arr[i]>max)
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum element is "+max);
       System.out.println("Minimum element is "+min);
       
       
  }
}