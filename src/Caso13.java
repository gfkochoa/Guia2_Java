import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Operación [1-6]: ");
		int oper = sc.nextInt();
		
		float resultado = 0;
		String nom_oper = "";
		
		switch (oper) {
			case 1:
				resultado = n1 + n2;
				nom_oper = "Suma";
				break;
			case 2:
				resultado = n1 - n2;
				nom_oper = "Resta";
				break;
			case 3:
				resultado = n1 * n2;
				nom_oper = "Producto";
				break;
			case 4:
				if (n2!=0) {
					resultado = n1 / n2;
					nom_oper = "División";
				} else {
					nom_oper = "No es posible hallar la división";
				}
				break;
			case 5:
				if (n2!=0) {
					resultado = n1 % n2;
					nom_oper = "Resto Entero";
				} else {
					nom_oper = "No es posible hallar el resto entero";
				}
				break;
			case 6:
				resultado = (n1 + n2) / 2;
				nom_oper = "Promedio";
				break;
			default:
				resultado = 0;
				nom_oper = "No exite operación";
		}
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		System.out.println("Operación: " + nom_oper);
		System.out.println("Resultado: " + resultado);

	}

}
