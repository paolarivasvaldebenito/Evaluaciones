package evaluacion01;

public class Ej03 {
	/* 3.Pedir el radio de una circunferencia y calcular su longitud
	 * 
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				
				        int r,result;
				        
						Scanner leer = new Scanner(System.in);
						System.out.println("Ingrese el valor del radio: ");
						r =leer.nextInt();
						
						
						result=(int)(Math.PI)*2*r;

						System.out.println("el resultado es:"+result);
	}

}
