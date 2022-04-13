package ejercicio_4;

import java.util.Hashtable;

import javax.swing.JOptionPane;

	/*
	 * @author Octavio Bernal
	 * @fecha 13/04/2022
	 * @version 0.0.0.1
	 */

public class MainApp {

	public static void main(String[] args) {

		int bucleInfinito = 0;
		String nombre = "";
		Hashtable<String, Articulos> articulos = new Hashtable<>();
		int contador = 0;

		// Creo un array de objetos y defino el límite en 100 objetos.
		Articulos arrArticulos[] = new Articulos[100];

		// Creo un bucle infinito en el menú para continuar agregando productos.
		// Con la opciópn salir se rompe el bucle.
		while (bucleInfinito == 0) {

			// Menú de acciones mediante showOptionalDialog
			int eleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción.", "Menú",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Añadir producto", "Modificar artículo", "Ver productos", "Salir" }, null);

			// @eleccion parámetro de selección de menú.
			if (eleccion == 0) {
				
				// Creo automaticamente objetos mediante un contador sin bucle.
				arrArticulos[contador] = new Articulos();

				// @nombre es el parámetro key del hashtable.
				nombre = JOptionPane.showInputDialog("Introduce nombre");

				// Comienza la introducción de valores del objeto. Mediante el contador se introducira
				// en un objeto o en otro.
				int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad"));
				arrArticulos[contador].setCantidad(cantidad);

				double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Introduce precio unitario"));
				arrArticulos[contador].setPrecioUnitario(precioUnitario);

				double precioBruto = precioUnitario * cantidad;
				arrArticulos[contador].setPrecioBruto(precioBruto);

				// Menú selector del iva para evitar fallos.
				double ivaEleccion = JOptionPane.showOptionDialog(null, "Selecciona IVA.", "Menú",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "21%", "10%", "4%" }, null);

				// @ivaEleccion es para seleccionar las acciones según el iva escogido.
				if (ivaEleccion == 0) {

					double iva = 1.21;
					double precioConIva = iva * precioBruto;
					arrArticulos[contador].setPrecioConIva(precioConIva);
					arrArticulos[contador].setIva(iva);

				} else if (ivaEleccion == 1) {

					double iva = 1.10;
					double precioConIva = iva * precioBruto;
					arrArticulos[contador].setPrecioConIva(precioConIva);
					arrArticulos[contador].setIva(iva);

				} else if (ivaEleccion == 2) {
					double iva = 1.04;
					double precioConIva = iva * precioBruto;
					arrArticulos[contador].setPrecioConIva(precioConIva);
					arrArticulos[contador].setIva(iva);
				}

				// Asigno una dirección en memória del key/value utilizando de referencia el contador.
				// Cada nombre "key" tendrá un objeto "value".
				articulos.put(nombre, arrArticulos[contador]);
				
				// Incremento el contador , si se pulsa de nuevo añadir articulo creará otro objeto 
				// mediante el contador.
				contador++;

			// Opción modificar artículo aún en desarrollo	
			} else if (eleccion == 1) {

				/* Funcionalidad en contrucción */
				System.out.println("En construcción");
				

			} else if (eleccion == 2) {

				JOptionPane.showMessageDialog(null, articulos);

			} else if (eleccion == 3) {
				bucleInfinito = 6;
			}
		}
	}
}
