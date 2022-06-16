//20.Write a Java program to find the second smallest element in an array.


import java.util.Arrays;
public class SecondSmallArray {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[1];
      System.out.println("2nd smallest element is ::"+res);
   }
}



