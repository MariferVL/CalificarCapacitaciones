
import java.util.Scanner;

public class AppCopy {

	static Scanner teclado = new Scanner(System.in);

	static String nombreEmpresa, fecha, hora, duracion;
	static int cantidadAsistentes;
	static String[][] datos;
	static boolean cond = true;


	public static String detectarLetras(String mensaje, Scanner teclado) {

		String entrada = "";

		while (cond) {
			System.out.println(mensaje);
			entrada = teclado.nextLine();
			if (entrada.matches("[a-zA-Z\\s]+${1,}")) {

				cond = false;
			} else {
				System.out.println("Escriba sólo letras");

			}
		}

		return entrada;

	}

	public static String detectarNumeros(String mensaje, Scanner teclado) {
		String entrada = "";

		while (cond) {

			System.out.println(mensaje);
			entrada = teclado.nextLine();

			if (entrada.matches("[0-9]{1,2}")) {

				cond = false;
			} else {
				System.out.println("Escriba sólo números");
			}
		}
		return entrada;
	}

	public static String validacionFecha(String mensaje, Scanner teclado) {
		
		String entrada = "";

        while (cond) {
        /* Validacion de fecha */ 
        while(cond){
            System.out.println(fecha);
			entrada = teclado.nextLine();
            if (fecha.matches("[a-zA-Z 0-9]")){

                cond = false;
            }
            else{
                System.out.println("Ingrese una fecha valida porfavor");
            }
			return entrada;
        }
	

	// Ingreso y validación del campo HORA

	while(cond){

		System.out.print("\n2.- Ingresa la hora (Ejemplo (20:30): ");
		hora = teclado.nextLine();

		if (hora.matches("^([01][0-9]|2[0-3]):[0-5][0-9]$")) {
			cond = false;
		} else {
			System.out.println("Ingrese un dato valido porfavor");
		}
	}
	}

	public static void ingresoNombreYnotas() {

		for (int i = 0; i < cantidadAsistentes; i++) {

			System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
			datos[i][0] = teclado.nextLine();

			System.out.print("Ingrese la calificación (1-7) del asistente " + (i + 1) + ": ");
			datos[i][1] = teclado.nextLine();
		}

	}

	public static void impresionDatos() {

		for (int x = 0; x < cantidadAsistentes; x++) {
			System.out.println("Nombre: " + datos[x][0] + "\nNota: " + datos[x][1]);
		}
	}

	public static void main(String[] args) {

		System.out.println("Ingrese el nombre de la empresa: ");
		nombreEmpresa = teclado.nextLine();

		String nombreEmpresa = detectarLetras("Ingrese el nombre de la empresa: ", teclado);
		String fecha = validacionFecha("Ingrese la fecha en la cual se realizará la capacitación: ", teclado);

		String hora = validacionHora("Ingrese la hora de la capacitación", teclado);

		String duracion = detectarNumeros("Ingrese la duración de la capacitación (ejemplo: 2)", teclado);
		System.out.println("Ingrese la cantidad de asistentes: ");

		cantidadAsistentes = teclado.nextInt();
		teclado.nextLine();
		datos = new String[cantidadAsistentes][2];

		for (int i = 0; i < cantidadAsistentes; i++) {

			datos[i][0] = detectarLetras("Ingrese el nombre del asistente " + (i + 1) + ": ", teclado);
			datos[i][1] = detectarNumeros("Ingrese la calificación (1-7) del asistente " + (i + 1) + ": ", teclado);
		}

	}
}
