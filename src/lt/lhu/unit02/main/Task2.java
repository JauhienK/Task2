package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc;
		int a;
		int b;

		sc = new Scanner(System.in);

		System.out.print(" Значение 1 катета = ");
		a = sc.nextInt();

		System.out.print(" Значение 2 катета = ");
		b = sc.nextInt();

		int c = (int) Math.sqrt(a * a + b * b);
		System.out.println(" Гипотенуза = " + c);

		int n = (int) (a * b) / 2;
		System.out.println(" Площадь прямоугольного треугольника = " + n);
	}
}