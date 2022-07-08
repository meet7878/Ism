package Taskjava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo {
	public static void main(String args[]) throws IOException {
		/*
		 * File demo = new File("C:\\Users\\lenovo\\Desktop\\ism\\demo.txt");
		 * f.createNewFile(); PrintWriter d = new PrintWriter(demo);
		 */

		File f = new File("C:\\Users\\lenovo\\Desktop\\ism\\odd.txt");
		/* f.createNewFile(); */
		PrintWriter p = new PrintWriter(f);
		/* FileOutputStream fos = new FileOutputStream(f); */

		File even = new File("C:\\Users\\lenovo\\Desktop\\ism\\Even.txt");
		/* even.createNewFile(); */
		PrintWriter s = new PrintWriter(even);

		Scanner sc = new Scanner(System.in);

		System.out.println("please Enter the total number");
		int totalNum = sc.nextInt();

		for (int i = 0; i < totalNum; i++) {
			System.out.println("please Enter the number");
			int Number = sc.nextInt();

			if (Number % 2 == 0) {
				s.println(Number);
			}

			else {
				p.println(Number);
			}
		}
		p.close();
		s.close();
	}
}