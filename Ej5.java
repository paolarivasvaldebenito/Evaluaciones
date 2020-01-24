package evaluacion01;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5.Pedir un numero e indicar si es positivo o negativo
		
		int a;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor: ");
		a =leer.nextInt();
		
		
		if (a>0) {
			System.out.println("es positivo");
		}else {
			System.out.println("es negativo");
		}

	}

}
