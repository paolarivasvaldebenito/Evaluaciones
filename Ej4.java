package evaluacion01;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4.Pedir dos numeros y decir si son iguales o no

        int num1,num2;
        
				Scanner leernum = new Scanner(System.in);
				
				System.out.println ("Ingrese el primer numero");
				num1 =leernum.nextInt();
				
				System.out.println ("Ingrese el segundo numero");
				num2 =leernum.nextInt();
				
				
		if (num1==num2) {
			System.out.println("los numeros ingresados son iguales ");
		}else {
			System.out.println("los numeros ingresados no son iguales ");
		}		
	
	}

}
