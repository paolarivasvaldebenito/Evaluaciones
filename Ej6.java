package evaluacion01;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6.Pedir dos numeros y decir si uno es multiplo de otro
		
		int num1,num2;
        
		Scanner leernum = new Scanner(System.in);
		
		System.out.println ("Ingrese el primer numero");
		num1 =leernum.nextInt();
		
		System.out.println ("Ingrese el segundo numero");
		num2 =leernum.nextInt();
		
		
		if (num1%num2==0) {
			System.out.println("los numeros son multiplos");
		}else {
			System.out.println("No son multiplos");	
			}
			
			
		}

	}


