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

		// Creo un array de objetos y defino el l�mite en 100 objetos.
		Articulos arrArticulos[] = new Articulos[100];

		// Creo un bucle infinito en el men� para continuar agregando productos.
		// Con la opci�pn salir se rompe el bucle.
		while (bucleInfinito == 0) {

			// Men� de acciones mediante showOptionalDialog
			int eleccion = JOptionPane.showOptionDialog(null, "Selecciona una opci�n.", "Men�",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "A�adir producto", "Modificar art�culo", "Ver productos", "Salir" }, null);

			// @eleccion par�metro de selecci�n de men�.
			if (eleccion == 0) {
				
				// Creo automaticamente objetos mediante un contador sin bucle.
				arrArticulos[contador] = new Articulos();

				// @nombre es el par�metro key del hashtable.
				nombre = JOptionPane.showInputDialog("Introduce nombre");

				// Comienza la introducci�n de valores del objeto. Mediante el contador se introducira
				// en un objeto o en otro.
				int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad"));
				arrArticulos[contador].setCantidad(cantidad);

				double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Introduce precio unitario"));
				arrArticulos[contador].setPrecioUnitario(precioUnitario);

				double precioBruto = precioUnitario * cantidad;
				arrArticulos[contador].setPrecioBruto(precioBruto);

				// Men� selector del iva para evitar fallos.
				double ivaEleccion = JOptionPane.showOptionDialog(null, "Selecciona IVA.", "Men�",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "21%", "10%", "4%" }, null);

				// @ivaEleccion es para seleccionar las acciones seg�n el iva escogido.
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

				// Asigno una direcci�n en mem�ria del key/value utilizando de referencia el contador.
				// Cada nombre "key" tendr� un objeto "value".
				articulos.put(nombre, arrArticulos[contador]);
				
				// Incremento el contador , si se pulsa de nuevo a�adir articulo crear� otro objeto 
				// mediante el contador.
				contador++;

			// Opci�n modificar art�culo a�n en desarrollo	
			} else if (eleccion == 1) {

				/* Funcionalidad en contrucci�n */
				System.out.println("En construcci�n");
				

			} else if (eleccion == 2) {

				JOptionPane.showMessageDialog(null, articulos);

			} else if (eleccion == 3) {
				bucleInfinito = 6;
			}
		}
	}
}
