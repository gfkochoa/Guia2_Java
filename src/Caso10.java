import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String empleado = sc.nextLine();
		
		System.out.print("Ingrese horas trabajadas: ");
		float ht = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tph = sc.nextFloat();
		
		System.out.print("Ingrese número de minutos de tardanza: ");
		int mt = sc.nextInt();
		
		float importe = ht * tph;
		float bono = 0, dscto = 0;
		float porc = ht * 10 / 7.0f;
		
		if (ht>60) {
			bono = importe * 0.13f;
		} else {
			bono = importe * 0.04f;
		}
		
		if (mt>15) {
			dscto = importe * 0.03f;
		}
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Trabajador: " + empleado);
		System.out.println("Horas Trabajadas: " + ht);
		System.out.println("Tarifa por horas: " + tph);
		System.out.println("Importe: " + importe);
		System.out.println("Bono: " + bono);
		System.out.println("Descuento: " + dscto);
		System.out.println("Meta alcanzada: " + porc + "%");

	}

}
