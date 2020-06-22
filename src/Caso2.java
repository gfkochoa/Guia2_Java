import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		String mensaje = "";
		
		if (n % 2 == 0)
			mensaje = "Número es par";
		else
			mensaje =" número es impar";
		
		System.out.println("Respuesta: " + mensaje);

	}

}
