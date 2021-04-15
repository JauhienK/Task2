//package lt.lhu.unit02.main;
//import java.util.Scanner;
//public class Task3 {
//	
//			public static void main(String[] args) {
//				Scanner sc;
//				int a;
//				int b;
//				int c;
//				int k;
//				sc = new Scanner(System.in);
//
//				System.out.print(" a = ");
//				a = sc.nextInt();
//
//				System.out.print(" b = ");
//				b = sc.nextInt();
//				
//				System.out.print(" c = ");
//				c = sc.nextInt();
//				
//				int k = (int) Math.pow(a, 2);
//				
//				System.out.println( " Ответ: " k);			
//			}
//		}
//	}
//
//}
package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc;
		int a;
		int b;
		int c;

		sc = new Scanner(System.in);

		System.out.print(" a = ");
		a = sc.nextInt();

		System.out.print(" b = ");
		b = sc.nextInt();
		
		System.out.print(" c = ");
		c = sc.nextInt();

		double z = (double) (Math.pow(a, 2) - Math.pow((b-c), 2) + Math.log(Math.pow(b, 2) + 1));
		
		System.out.println("  " + z);

	}
}