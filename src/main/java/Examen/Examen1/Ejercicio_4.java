package Examen.Examen1;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
		} while (n < 2);
		
		sc.close();
		
		//Este bucle lo utilizamos para hacer la copa del arbol
		for (int copa = 1; copa <= n; copa++) {
			for (int espacios = n - 1; espacios >= copa; espacios--) {
				System.out.print(" ");
			}
			if (copa % 2 == 0) {
				for (int asteriscos = 1; asteriscos < 2 * copa; asteriscos++) {
					System.out.print("*");
				}
			} else {
				for (int num = copa; num > 1; num--) {			
					System.out.print(num);
				}
				for (int num = 1; num <= copa; num++) {				
					System.out.print(num);
				}
			}
			System.out.println();
		}
		//Este bucle es para el tronco
		for(int tronco = 1; tronco <= n; tronco++) {
            for (int espacios = 1; espacios > 0; espacios--) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos < (2 * n) - 2; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
		}

	}
}
