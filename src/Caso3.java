import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int n2 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2)
			mensaje = "Los n�meros son iguales";
		else if (n1 > n2)
			mensaje = "El primer n�mero es mayor";
		else
			mensaje = "El segundo n�mero es mayor";
		
		System.out.println("Respuesta: " + mensaje);

	}

}
