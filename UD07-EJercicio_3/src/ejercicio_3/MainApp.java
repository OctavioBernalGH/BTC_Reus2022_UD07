package ejercicio_3;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class MainApp {
	
	public static void main(String[] args) {
		
		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 12/04/2022
		 * 
		 * @version 0.0.0.1
		 */
		
		/*
		 * A la hora de resolver este programa te das cuenta de que ya comienzas a necesitar
		 * estructuras más avanzadas , como objetos.
		 */
		
		String [] opcion = { "Añadir producto" , "Modificar cantidad" , "Ver productos"};
		
		String articulo;
		int cantidadProducto = 0;
		double precio;
		int bucle = 0;
		
		// HashTable
		Hashtable<String, Double> bbdd = new Hashtable<>();
		Hashtable<Hashtable, Integer> cantidad = new Hashtable<>();

		while (bucle==0) {
			
		// Menú de acciones
		int eleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción.","Menú", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				new Object[]{"Añadir producto" , "Modificar cantidad" , "Ver productos", "Salir"}, null);
		
		// Selector de acciones
		if(eleccion == 0) {
			
			articulo = JOptionPane.showInputDialog("Introduce nombre articulo").toUpperCase();
			precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce precio"));
			cantidadProducto = Integer.parseInt((JOptionPane.showInputDialog("Introduce cantidad")));
			bbdd.put(articulo, precio);
			cantidad.put(bbdd, cantidadProducto);
			
		} else if (eleccion == 1) {
			
		String modificarPrecio = JOptionPane.showInputDialog("Nombre de artículo").toUpperCase();
			if(bbdd.containsKey(modificarPrecio)) {
				precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce precio"));
				bbdd.replace(modificarPrecio, precio);
			} else {
				JOptionPane.showMessageDialog(null, "Error al modificar precio");
			}
			
		} else if (eleccion == 2) {

			JOptionPane.showMessageDialog(null, "\n" + bbdd + "\n" +cantidad.values());
			
		} else if(eleccion == 3) {
			
			bucle=1;
		}
	}
	} 
}
