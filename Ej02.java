package evaluacion01;

import java.util.Scanner;

public class Ej02 {
	/* 2.Pedir el radio de un círculo y calcular su área. A=PI*r^2.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double pi=3.141592653569793;
		
		System.out.println("Ingrese el area de circulo");
		float r =sc.nextFloat();
		double area=pi*r*r;
		
		float arearedondeada = Math.round(area); 
		System.out.println("El area del circulo es : "+area);
		System.out.println("El area del circulo es : "+arearedondeada);


	}

}
