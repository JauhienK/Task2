package lt.lhu.unit02.main;
import java.util.Scanner;
public class Task6 {
	
			public static void main(String[] args) {
				Scanner sc;
				double a;
				double b;
				double c;
				double d;

				sc = new Scanner(System.in);

				System.out.print(" a = ");
				a = sc.nextInt();

				System.out.print(" b = ");
				b = sc.nextInt();
				
				System.out.print(" c = ");
				c = sc.nextInt();
				
				System.out.print(" d = ");
				d = sc.nextInt();

				double z = (double) (a/c)*(b/d)-((a*b-c)/(c*d));
				
				System.out.println(" Ответ = " + z);

			}
		}
