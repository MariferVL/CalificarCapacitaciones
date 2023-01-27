
import java.util.Scanner;




public class App {

    	//Calificar capacitación
	//administrar los principales procesos que se llevan a cabo en ella día a día.
	// capacitaciones son instancias para todos los clientes que posee 
	//(generalmente a otras empresas).
    //presentan diferentes asistentes,
    //TODO:  obtener nombre asistentes y 
     //TODO: obtener calificación que entrega a un determinado evento.
	 //TODO: solicitar programa solicite  día, 
     //TODO: solicitar hora, 
     //TODO: solicitar lugar, 
     //TODO: solicitar duración y 
     //TODO: solicitar cantidad asistentes de una capacitación.
     //TODO: crear  arreglo que tenga dicha cantidad de filas y dos columnas.
     //TODO: primera columna el nombre asistente
     //TODO: segunda columna  calificación  usuario entrega.
     //TODO: almacene en la matriz la calificación como  String ==> nota entre 1 y 7,
     //TODO: calificaciones solo pueden corresponder a valores enteros.
     //TODO: ingresada la última calificación, debe mostrar por consola  datos de capacitación, 
     //TODO: mostrar promedio de notas asignada, 
     //TODO: mostrar calificación mayor y calificación menor.
	//TODO: considere que el arreglo no almacenará las calificaciones de todas las capacitaciones, ya que los arreglos son estructuras volátiles
	//TODO: se  permite uso de dos arreglos, 
    //TODO: un arreglo de String para nombre y un arreglo de enteros para calificación. 
	//TODO: ambos arreglos deben tener el mismo tamaño.
    
	static Scanner teclado = new Scanner(System.in);
    
	static String nombreEmpresa, fecha, hora, duracion;
	static int cantidadAsistentes;
	static String[][] datos;
    static boolean cond = true;

	public static void datosCapacitacion() {

		System.out.println("Ingrese el nombre de la empresa: ");
		nombreEmpresa = teclado.nextLine();

		System.out.println("Ingrese la fecha en la cual se realizará la capacitación: ");
		fecha = teclado.nextLine();

		System.out.println("Ingrese la hora de la capacitación");
		hora = teclado.nextLine();
        
		System.out.println("Ingrese la duración de la capacitación (ejemplo: 2)");
		duracion = teclado.nextLine();
        
		System.out.println("Ingrese la cantidad de asistentes");
		cantidadAsistentes = teclado.nextInt();
        
		teclado.nextLine();
		
		datos = new String[cantidadAsistentes][2];

	}

    public static void validacionNombre() {

        // Validación de nombre Empresa
        
        while(cond){

            if(nombreEmpresa.matches("[a-zA-Z]{1,}")){

                cond = false;
            }
            else{
                System.out.println("Ingrese un nombre valido porfavor");
            }
        }
    }

    public static void validacionFecha() {

        // Validación de fecha
        /* Validacion de fecha */ 
        while(cond){
            
            if (fecha.matches("[a-zA-Z 0-9]")){

                cond = false;
            }
            else{
                System.out.println("Ingrese una fecha valida porfavor");
            }
        }

        // Ingreso y validación del campo HORA

		while (cond) {

			System.out.print("\n2.- Ingresa la hora (Ejemplo (20:30): ");
			hora = teclado.nextLine();

			if (hora.matches("^([01][0-9]|2[0-3]):[0-5][0-9]$")) {
				cond = false;
			} 
            else {
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
        
		datosCapacitacion();
		ingresoNombreYnotas();
		impresionDatos();
	}
}
