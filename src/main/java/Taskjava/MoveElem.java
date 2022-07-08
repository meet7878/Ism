
/*16) 	  	    
   	Move all the negative elements to one side of the array. 
		input -> 1  3  -4  5  -6   23   -45    67   43   44   56   -90   100
		Output -> 1  3   5    23   67   43    56    100   -4   -6  -45   -90  */

package Taskjava;
//input ->   1   3   -4    5   -6   23    -45    67    43   44   56   -90   100
//output->   1  -4   3    -6   5   -45     23   -90   67   43   44    56    100

import java.util.Scanner;
public class MoveElem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }																																																									
        int[] arr2 = new int[n];           	
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr2[j]=arr[i];
                
                System.out.print(arr2[j]+" ");     
                }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<=0){
                arr2[j]=arr[i];
                System.out.println(arr2[j]); 
            }
        }

    }
}