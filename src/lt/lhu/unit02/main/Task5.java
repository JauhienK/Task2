package lt.lhu.unit02.main;
import java.util.Scanner;
public class Task5 {

		public static void main(String[] args) {
			Scanner sc;
			double a;
			double b;
			double c;

			sc = new Scanner(System.in);

			System.out.print(" a = ");
			a = sc.nextInt();

			System.out.print(" b = ");
			b = sc.nextInt();
			
			System.out.print(" c = ");
			c = sc.nextInt();

			double z = (double) (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a) - c * Math.pow(a, 3) + b;
			
			System.out.println(" Ответ = " + z);

		}
	}
