package ejercicio_1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class MainApp {
	
	/*
	 * @author Octavio Bernal
	 * 
	 * @fecha 11/04/2022
	 * 
	 * @version 0.0.0.1
	 */

	/*
	 * Flujo del programa
	 * 1. Crea un ArrayList para cada alumno y almacena sus notas.
	 * 2. Calcula su media de notas.
	 * 3. Rellena un Hashtable con "nombre" como key y "nota media" value.
	 */
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		/* ArrayList del alumno 1, es donde almacenaremos la nota para la posterior media */
		ArrayList<Integer> alumno1 = new ArrayList<>();
		System.out.print("Introduce nombre alumno 1:");
		String nombreAlumno1 = sc.next();
		int mediaAlumno1 = alumno1Notas(alumno1);
		
		/* ArrayList del alumno 2, es donde almacenaremos la nota para la posterior media */
		ArrayList<Integer> alumno2 = new ArrayList<>();
		System.out.print("Introduce nombre alumno 2:");
		String nombreAlumno2 = sc.next();
		int mediaAlumno2 = alumno2Notas(alumno2);
		
		/* ArrayList del alumno 3, es donde almacenaremos la nota para la posterior media */
		ArrayList<Integer> alumno3 = new ArrayList<>();
		System.out.print("Introduce nombre alumno 3:");
		String nombreAlumno3 = sc.next();
		int mediaAlumno3 = alumno3Notas(alumno3);
		
		/* Llamo a la función que rellenará el hashtable*/
		rellenarHash(mediaAlumno1, nombreAlumno1, mediaAlumno2, nombreAlumno2, mediaAlumno3, nombreAlumno3);
			
	}
	
	/* Método alumno1Notas */
	// Este método recibe como parámetro un ArrayList, se introduce por teclado el número de notas
	// que queremos tener, se almacena en el mismo ArrayList y se calcula la media aritmética.
	
	public static int alumno1Notas(ArrayList<Integer>alumno1) {
		System.out.println("==========ALUMNO 1============");

		// Cuantas notas queremos entrar al sistema.
		System.out.print("Cantidad notas alumno 1: ");
		int cantidadNotas = sc.nextInt();
					
		// Notas introducidas.
		int notasAlumno1;
		
		// Suma de todas para posterior media.
		int sumatorioNotas1 = 0;
		
		// Se recorre bucle for n veces, donde n es la cantidad de notas que queremos introducir.
		for(int i=0; i<cantidadNotas; i++) {
			System.out.print("Introduce nota: ");
			notasAlumno1 = sc.nextInt();
			// Se almacena la nota en el ArrayList. En cada ida del bucle se almacena una nota en diferente posición.
			alumno1.add(notasAlumno1);
			// Suma de notas acumuladas.
			sumatorioNotas1 += notasAlumno1;
		}
		
		System.out.println("Notas: " + alumno1.toString());
		int mediaAlumno1 = sumatorioNotas1 / cantidadNotas;
		System.out.println("Nota media: " + mediaAlumno1);
		return mediaAlumno1;
		
	}
	
	/* Método alumno2Notas */
	// Este método recibe como parámetro un ArrayList, se introduce por teclado el número de notas
	// que queremos tener, se almacena en el mismo ArrayList y se calcula la media aritmética.
	
	public static int alumno2Notas(ArrayList<Integer>alumno2) {
		System.out.println("==========ALUMNO 2============");
		// Cantidad de notas por teclado.
		System.out.print("Cantidad notas alumno 3: ");
		int cantidadNotas2 = sc.nextInt();
		// La nota ingresada por teclado
		int notasAlumno2;
		// Sumatorio de todas las notas para posterior media.
		int sumatorioNotas2 = 0;
		
		// Se recorre el bucle x veces mediante la cantidad entrada por teclado.
		for(int i=0; i<cantidadNotas2; i++) {
			System.out.print("Introduce nota: ");
			notasAlumno2 = sc.nextInt();
			// Se añade la nota introducida al ArrayList.
			alumno2.add(notasAlumno2);
			sumatorioNotas2 += notasAlumno2;
		}
		
		System.out.println("Notas: " + alumno2.toString());
		int mediaAlumno2 = sumatorioNotas2 / cantidadNotas2;
		System.out.println("Nota media: " + mediaAlumno2);
		return mediaAlumno2;
	}
	
	/* Método alumno3Notas */
	// Este método recibe como parámetro un ArrayList, se introduce por teclado el número de notas
	// que queremos tener, se almacena en el mismo ArrayList y se calcula la media aritmética.
	
	public static int alumno3Notas(ArrayList<Integer>alumno3) {
		System.out.println("==========ALUMNO 3============");
		// Cantidad de notas por teclado.
		System.out.print("Cantidad notas alumno 3: ");
		int cantidadNotas3 = sc.nextInt();
		
		// La nota ingresada por teclado
		int notasAlumno3;
		// Sumatorio de todas las notas para posterior media.
		int sumatorioNotas3 = 0;
		
		// Se recorre el bucle x veces mediante la cantidad entrada por teclado.
		for(int i=0; i<cantidadNotas3; i++) {
			System.out.print("Introduce nota: ");
			notasAlumno3 = sc.nextInt();
			// Se añade la nota introducida al ArrayList.
			alumno3.add(notasAlumno3);
			sumatorioNotas3 += notasAlumno3;
		}
		
		System.out.println("Notas: " + alumno3.toString());
		int mediaAlumno3 = sumatorioNotas3 / cantidadNotas3;
		System.out.println("Nota media: " + mediaAlumno3);
		return mediaAlumno3;
	}
	
	// Método rellenar hash, se le pasan por parámetros las medias y nombres de cada alumno.
	// Este método rellena manualmente el hash de 3 alumnos mediante la función put.
	// Se ingresa nombre como key y la nota media como value.
	public static void rellenarHash(int mediaAlumno1, String nombreAlumno1, int mediaAlumno2, String nombreAlumno2,
			int mediaAlumno3, String nombreAlumno3) {
		
		Hashtable<String, Integer> listadoAlumnos = new Hashtable<>();
		listadoAlumnos.put(nombreAlumno1, mediaAlumno1);
		listadoAlumnos.put(nombreAlumno2, mediaAlumno2);
		listadoAlumnos.put(nombreAlumno3, mediaAlumno3);
		
		System.out.println(listadoAlumnos);
		
	}
}
