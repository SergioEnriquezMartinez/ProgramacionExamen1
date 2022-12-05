package Examen.Examen1;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		sc.close();
		int factorial = 1, resta = 0;
		
		if (n == 0 || n == 1) {
			factorial = 1;
		} else if (n % 2 == 0) {
			for (int i = 1; i <= n; i += 2) {
				resta -= 2;
				factorial *= resta;
			}

		} else {
			resta = 1;
			for (int i = 1; i <= n; i += 2) {
				resta -= 2;
				factorial *= resta;
			}
		}
		System.out.println("El factorial de " + n + " es " + factorial);
	}
}
