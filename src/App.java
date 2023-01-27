import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO: considere que arreglo no almacenará calificaciones de todas las
		// capacitaciones, ya que los arreglos son estructuras volátiles
		// TODO: se permite uso de dos tipos arreglos,
		// TODO: un arreglo de String para nombre y un arreglo de enteros para
		// calificación.

		// Crear elemento tipo scanner para obtener inputs de usuario.
		Scanner scanner = new Scanner(System.in);

		// Crear una var tipo boolean para control de bucles.
		boolean cond = true;

		// FIXME: les parece si en vez de nombre de  empresa pedimos el titulo de la capacitación?
		// Obtener nombre de empresa.
		String nombreEmpresa = detectarLetras("Ingrese nombre de empresa: ", scanner, cond);

		// Obtener fecha de capacitación.
		String fecha = validacionFecha("Ingrese fecha de realización de capacitación (dd-mm-aa): ", scanner, cond);

		// Obtener hora de capacitación.
		String hora = validacionFecha("Ingrese hora de capacitación (Formato 24hrs): ", scanner, cond);

		// Obtener duración de capacitación.
		String duracion = detectarNumeros("Ingrese duración de capacitación (Ej: 2): ", scanner, cond);

		// Obtener cantidad de asistentes a de capacitación.
		String cantidadAsistentes = detectarNumeros("Ingrese cantidad de asistentes: ", scanner, cond);
		System.out.println("asistentes: " + cantidadAsistentes);
		// int totalAsistentes = Integer.parseInt(cantidadAsistentes);
		int totalAsistentes = 2;

		// Solicitar lugar de realización de capacitación,
		String ubicacionCapacitacion = detectarLetras("Ingrese ubicación de capacitación: ", scanner, cond);

		// Declaración de una matriz para la data de nombres y cantidad de asistentes.
		String[][] datos = new String[2][totalAsistentes];

		// Solicitar datos de asistentes dependiendo de su cantidad.
		for (int i = 0; i < totalAsistentes; i++) {
			// Obtener nombre de asistentes.
			datos[0][i] = detectarLetras("Ingrese nombre de asistente: " + (i + 1) + ": ", scanner, cond);

			// Obtener calificación de asistentes con sólo números enteros
			// Almacenar en matriz calificación con nota de 1 a 7 en dato tipo String.
			datos[1][i] = detectarRango(detectarNumeros(datos[0][i] + " ingrese su calificación (1-7): ",
					scanner, cond), scanner, cond);
		}

		

		// TODO: ingresada la última calificación, debe mostrar por consola datos de capacitación,
		// System.out.println("Fecha capacitación: " + fecha + " a las "+ hora);


		// TODO: mostrar promedio de notas asignada,
		System.out.println("Promedio de Calificaciones: " + obtenerPromedio(datos[1]));


		// TODO: mostrar calificación mayor y calificación menor.


	}

	// Solicitar input de usuario y comprobar si contiene letras.
	public static String detectarLetras(String mensaje, Scanner teclado, boolean cond) {
		String entrada = "";

		while (cond) {
			System.out.print(mensaje);
			entrada = teclado.nextLine();

			if (entrada.matches("[a-zA-Z\\s]+${1,}")) {
				cond = false;
			} else {
				System.out.println("Escriba sólo letras");
			}
		}
		return entrada;
	}

	// Solicitar input de usuario y comprobar si contiene números.
	public static String detectarNumeros(String mensaje, Scanner teclado, boolean cond) {
		String entrada = "";

		while (cond) {

			System.out.print(mensaje);
			entrada = teclado.nextLine();

			if (entrada.matches("[0-9]+")) {
				cond = false;
			} else {
				System.out.println("Escriba sólo números");
			}
		}
		return entrada;
	}

	// Solicitar input de usuario y comprobar si contiene formato de fecha y hora.
	public static String validacionFecha(String mensaje, Scanner teclado, boolean cond) {
		String entrada = "";

		while (cond) {
			System.out.print(mensaje);
			entrada = teclado.nextLine();
			// FIXME: Validar Formato fecha
			if (entrada.matches("^((0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])-(20|2[0-9])[0-9]{2})$")) {
				cond = false;
				// FIXME: Validar Formato fecha
			} else if (entrada.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
				cond = false;
			} else {
				System.out.println("Ingrese dato válido, porfavor");
			}
		}
		return entrada;
	}

	// Detectar si calificación está dentro del rango.
	public static String detectarRango(String data, Scanner teclado, boolean cond) {
		// FIXME: cambiar por condición que deseen
		while (cond) {
			if (Integer.parseInt(data) < 8 && Integer.parseInt(data) > 0) {
				cond = false;
			} else {
				System.out.println("Por favor, ingrese una calificación entre 1(mala) y 7 (excelente)");
				data = detectarNumeros(" Ingrese su calificación (1-7): ", teclado, cond);
			}
		}
		return data;
	}

	// Calcular promedio.
	public static int obtenerPromedio(String[] calificaciones) {
		int promedio = 0;

		//TODO: agregar calculo


		return promedio;
		
	}
}
