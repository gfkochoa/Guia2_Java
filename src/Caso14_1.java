import java.util.Scanner;

public class Caso14_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String alumno = sc.nextLine();
		
		System.out.print("Ingrese carrera [DS/RC/DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("Ingrese turno [M/T/N]: ");
		String turno = sc.nextLine();
		
		int monto = 0;
		String nom_car = "", nom_turno = "";
		
		if (carrera.equals("DS") || carrera.equals("ds")) {
			monto = 1500;
			nom_car = "Desarrollo de Software";
		} else if (carrera.equals("RC") || carrera.equals("rs")) {
			monto = 1400;
			nom_car = "Redes y Conectividad";
		} else if (carrera.equals("DG") || carrera.equals("dg")) { 
			monto = 1300;
			nom_car = "Diseño Gráfico";
		} else {
			monto = 0;
			nom_car = "No existe opción";
		}
		
		float dscto = 0;
		
		if (turno.equals("M") || turno.equals("m")) {
			dscto = monto * 0.1f;
			nom_turno = "Mañana";
		} else if (turno.equals("T") || turno.equals("t")) {
			dscto = monto * 0.2f;
			nom_turno = "Tarde";
		} else if (turno.equals("N") || turno.equals("n")) {
			dscto = monto * 0.15f;
			nom_turno = "Noche";
		} else {
			nom_turno = "No existe turno";
		}
		
		float total = monto - dscto;
		float dolar = monto / 3.33f;
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Alumno: " + alumno);
		System.out.println("Carrera: " + nom_car);
		System.out.println("Turno: " + nom_turno);
		System.out.println("Monto: " + monto);
		System.out.println("Descuento: " + dscto);
		System.out.println("Total: " + total);
		System.out.println("Total en dólares: " + dolar);

	}

}
