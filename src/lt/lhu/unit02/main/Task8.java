package lt.lhu.unit02.main;
import java.util.Scanner;
public class Task8 {
	
		public static void main(String[] args) {
					Scanner sc;
					double a;
					double b;
					double h;
					double y;
					
					sc = new Scanner(System.in);

					System.out.print(" a = ");
					a = sc.nextInt();

					System.out.print(" b = ");
					b = sc.nextInt();
					
					System.out.print(" h = ");
					h = sc.nextInt();
							
					System.out.println("---------------------------------");
					System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
					System.out.println("---------------------------------");
					
					for(double x = a; x <= b; x = x + h) {
						y = 2 * Math.tan(x/2) + 1;
						System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
					}
					System.out.println("---------------------------------");

}
}
