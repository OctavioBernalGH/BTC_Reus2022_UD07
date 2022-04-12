package ejercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 11/04/2022
		 * 
		 * @version 0.0.0.1
		 */
		
		ArrayList<Double> articulo = new ArrayList<>();

		// Introducimos datos de artículos.
		System.out.print("Introduce el números de peras a comprar: ");
		double pera = sc.nextDouble();
		articulo.add(pera);

		System.out.print("Introduce el número de manzanas a comprar: ");
		double manzana = sc.nextDouble();
		articulo.add(manzana);

		System.out.print("Introduce el número de lechugas a comprar: ");
		double lechuga = sc.nextDouble();
		articulo.add(lechuga);

		// Calculo del bruto.
		double precioBrutoPera = 0.12 * pera;
		articulo.add(precioBrutoPera);

		double precioBrutoManzana = 0.25 * manzana; 
		articulo.add(precioBrutoManzana);

		double precioBrutoLechuga = 0.2 * lechuga;
		articulo.add(precioBrutoLechuga);

		// Calculo precio + IVA.
		double precioConIvaPera = precioBrutoPera * 1.04;
		articulo.add(precioConIvaPera);

		double precioConIvaManzana = precioBrutoManzana * 1.04;
		articulo.add(precioConIvaManzana);

		double precioConIvaLechuga = precioBrutoLechuga * 1.04;
		articulo.add(precioConIvaLechuga);
		
		double precioTotal = precioConIvaPera + precioConIvaManzana + precioConIvaLechuga;
		double totalPagado=0, pagar = 0;
		double resto = 0;
		
		System.out.print("Introduce " + precioTotal + " euros por favor: ");
		while(totalPagado<precioTotal) {
			pagar = sc.nextDouble();
			totalPagado += pagar;
			resto = totalPagado - precioTotal;
			if(totalPagado<precioTotal) {
			System.out.println("Falta pagar " + resto);
			}
		}
		articulo.add(totalPagado);
		System.out.println("El resto es: " + resto);
		articulo.add(resto);
		
		System.out.println(articulo.toString());

	}
}
