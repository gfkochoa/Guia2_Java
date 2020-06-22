import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre de alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese primera nota: ");
		int nota1 = sc.nextInt();
		
		System.out.print("Ingrese segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.print("Ingrese número de asistencias: ");
		int asistencias = sc.nextInt();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float porcentaje = asistencias * 100 / 12.0f;
		String mensaje = "";
		
		if (promedio >=13 && porcentaje >= 70)
			mensaje = "Aprobado";
		else
			mensaje = "Desaprobado";
		
		System.out.println("RESULTADOS");
		System.out.println("----------");
		System.out.println("Alumno: " + nombre);
		System.out.println("Promedio: " + promedio);
		System.out.println("Asistencia: " + porcentaje + "%");
		System.out.println("Estado: " + mensaje);

	}

}
