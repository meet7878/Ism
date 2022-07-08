package Taskjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileCount {
	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String path=sc.next();
		File f = new File(path);
		
		BufferedReader b = new BufferedReader(new FileReader(f));
		
		
	}

}
