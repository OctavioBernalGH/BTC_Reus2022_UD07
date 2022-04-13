package ejercicio_4;

import javax.swing.JOptionPane;

public class Articulos {

	private int cantidad;
	private double precioUnitario;
	private double precioBruto;
	private double precioConIva;
	private double iva;
	
	
	public Articulos() {}
	
	public Articulos(int cantidad, double precioUnitario, double precioBruto, double precioConIva, double iva) {
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.precioBruto = precioBruto;
		this.precioConIva = precioConIva;
		this.iva = iva;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioBruto() {
		return precioBruto;
	}

	public void setPrecioBruto(double precioBruto) {
		this.precioBruto = precioBruto;
	}

	public double getPrecioConIva() {
		return precioConIva;
	}

	public void setPrecioConIva(double precioConIva) {
		this.precioConIva = precioConIva;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", precioBruto=" + precioBruto
				+ ", precioConIva=" + precioConIva + ", iva=" + iva;
	}



	
}
