//package lt.lhu.unit02.main;
//
//import java.util.Scanner;
//
//public class Task7 {
//
//	public static void main(String[] args) {
//				Scanner sc;
//				double a;
//				double b;
//				double c;
//
//				sc = new Scanner(System.in);
//
//				System.out.print(" a = ");
//				a = sc.nextInt();
//				
//				if(a < 0) {
//					System.out.println("a2 = " + Math.pow(a, 4));
//					}else {
//					System.out.println("a4 = " + Math.pow(a, 2));
//					}
//				System.out.print(" b = ");
//				b = sc.nextInt();
//				
//				if(b < 0) {
//					System.out.println("b2 = " + Math.pow(b, 4));
//					}else {
//					System.out.println("b4 = " + Math.pow(b, 2));
//					}
//				System.out.print(" c = ");
//				c = sc.nextInt();
//				
//				if(c < 0) {
//					System.out.println("ac = " + Math.pow(c, 4));
//					}else {
//					System.out.println("ac = " + Math.pow(c, 2));
//
//				}
//					}
//					}

package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
				Scanner sc;
				double a;
				double b;
				double c;

				sc = new Scanner(System.in);

				System.out.print(" a = ");
				a = sc.nextInt();
				
				if(a < 0) {
				a = Math.pow(a, 4);
				}else {
				a = Math.pow(a, 2);
				}
				
				System.out.print(" b = ");
				b = sc.nextInt();
				
				if(b < 0) {
				b = Math.pow(b, 4);
				}else {
				b = Math.pow(b, 2);
				}
				
				System.out.print(" c = ");
				c = sc.nextInt();
				
				if(c < 0) {
				c = Math.pow(c, 4);
	        	}else {
	        	c = Math.pow(c, 2);
	}
				System.out.println(" a = " + a + ";"+ " b = " + b + ";"+" c = " + c + ";");
}
}
