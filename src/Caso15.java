import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cliente: ");
		String cliente = sc.nextLine();
		
		System.out.print("Ingrese producto [TB/LT/MN/IM]: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Ingrese forma de pago [C1/C2]: ");
		String form_pago = sc.nextLine();
		
		float precio = 0, importe = 0;
		String nom_prod = "";
		
		switch (producto) {
			case "TB":
				precio = 350;
				nom_prod = "Tablet";
				break;
			case "LT":
				precio = 2300;
				nom_prod = "Laptop";
				break;
			case "MN":
				precio = 850;
				nom_prod = "Monitor";
				break;
			case "IM":
				precio = 680;
				nom_prod = "Impresora";
				break;
			default:
				precio = 0;
				nom_prod = "No existe el producto";
		}
		
		importe = precio * cantidad;
		float dscto = 0, increm = 0;
		String nom_fpago = "";
		
		switch (form_pago) {
			case "C1":
				dscto = importe * 0.05f;
				nom_fpago = "Contado";
				break;
			case "C2":
				increm = importe * 0.12f;
				nom_fpago = "Crédito";
				break;
			default:
				nom_fpago = "No existe forma de pago";
		}
		
		float total = importe - dscto + increm;
		
		System.out.println("Cliente: " + cliente);
		System.out.println("Producto: " + nom_prod);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Importe: " + importe);
		System.out.println("Forma de pago: " + nom_fpago);
		switch (form_pago) {
			case "C1":
				System.out.println("Descuento: " + dscto);
				break;
			case "C2":
				System.out.println("Incremento: " + increm);
				break;
			default:
				System.out.println("No exite ningún descuento o incremento");
		}
		System.out.println("Total a pagar: " + total);
		
		// Este problema se puede hacer de forma similar al Caso14_1
		// El código que he hecho es una forma de resolver
		// el problema pero creo que se puede mejorar aunqur no sé como. 

	}

}
