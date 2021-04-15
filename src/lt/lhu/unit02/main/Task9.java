package lt.lhu.unit02.main;
import java.util.Scanner;
public class Task9 {
	
	public static void main(String[] args) {
		Scanner sc;
		double x;
		
		sc = new Scanner(System.in);

		System.out.print(" x = ");
		x = sc.nextInt();
		
		if (x <= -3) {
			System.out.println("F(x) = 9");
		}
		if (x > 3) {
			double y = 1 / (Math.pow(x, 2) + 1);
			System.out.println("F(x) = " + y);
		
//		}else {
//			System.out.println("Что-то не то");
		}
			
		}
		
		

}
