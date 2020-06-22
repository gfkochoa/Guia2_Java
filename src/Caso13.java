import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer n�mero: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Operaci�n [1-6]: ");
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
					nom_oper = "Divisi�n";
				} else {
					nom_oper = "No es posible hallar la divisi�n";
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
				nom_oper = "No exite operaci�n";
		}
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("N�mero 1: " + n1);
		System.out.println("N�mero 2: " + n2);
		System.out.println("Operaci�n: " + nom_oper);
		System.out.println("Resultado: " + resultado);

	}

}
