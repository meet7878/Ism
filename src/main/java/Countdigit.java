import java.util.*;

class Countdigit{
	
	public static void main(String args[]) {
		int i,j,k,count=0;
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				for(k=1;k<=4;k++) {
					if(i!=j && i!=k && j!=k) {
						System.out.println(i+""+j+""+k);
						count++;
					}
				}
			}
		}
		
		System.out.println("total unique num is="+count);
	}
	
}