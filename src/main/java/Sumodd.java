import java.util.*;
class Sumodd{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value:");
        int j = sc.nextInt();
        int i,even=0,odd=0;

        int temp[] = new int[j];

        for(i=0;i<temp.length;i++){
        System.out.println("Enter Array:");
        temp[i] = sc.nextInt();
        }
        for(i=0;i<temp.length;i++){

            if(temp[i] % 2 == 0){
                even = even + temp[i];
                
            }
            else{
                odd = odd + temp[i];
            }
        
        }

        System.out.println("Even  "+even);
        System.out.println("Odd   "+odd);

    }
}