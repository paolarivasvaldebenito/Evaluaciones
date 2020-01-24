package evaluacion01;

import java.util.Scanner;

public class Ej01 {
	/*1.Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no
	 * existen, debe indicarlo. Calcula la ecuacion de la formula cuadratica.
	 */
	
	public static void main(String[] args) {
		
		
	     Scanner leer = new Scanner(System.in); //se crea objeto tipo scanner
	     double a,b,c;

	    System.out.println("Calcular la siguiente funcion: ax^2+bx+c=0:");
	    
       System.out.println("Ingrese el valor de a: ");
       a = (double)leer.nextDouble(); 

       System.out.println("Ingrese el valor de b: ");
       b = (double)leer.nextDouble(); 
       
       System.out.println("Ingreseel valor de c: ");
       c = (double)leer.nextDouble(); 
       
       

       //Obtien los valores x1,x2 de la ecuacion

       double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

       double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

       //imprime los valores

       System.out.println("La solucion de x1: "+x1);

       System.out.println("La solucion de x2: "+x2);

	

	}

}
