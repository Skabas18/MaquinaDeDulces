package com.cmc.maquina;

import com.cmc.componentes.Celda;
import com.cmc.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1, celda2, celda3, celda4;
	private double saldo;

	
	
	


	public void configurarMaquina(String c1, String c2, String c3, String c4){
		celda1=new Celda(c1);
		celda2=new Celda(c2);
		celda3=new Celda(c3);
		celda4=new Celda(c4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Codigo celda 1: " + celda1.getCodigo());
		System.out.println("Codigo celda 2: " + celda2.getCodigo());
		System.out.println("Codigo celda 3: " + celda3.getCodigo());
		System.out.println("Codigo celda 4: " + celda4.getCodigo());
		System.out.println("Saldo actual: " + saldo);
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo().equals(codigo)) {
			return celda1;
		} else if (celda2.getCodigo().equals(codigo)) {
			return celda2;
		} else if (celda3.getCodigo().equals(codigo)) {
			return celda3;
		} else if (celda4.getCodigo().equals(codigo)) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}

	public void mostrarProductos() {
		if(celda1.getProducto() != null){
			System.out.println("Celda: "+celda1.getCodigo());
			System.out.println("Stock: "+celda1.getStock());
			System.out.println("Nombre producto: "+celda1.getProducto().getNombre());
			System.out.println("Precio producto: "+celda1.getProducto().getPrecio());
			System.out.println("Codgio Producto: "+celda1.getProducto().getCodigo());
		}else{
			System.out.println("\nCelda: "+celda1.getCodigo());
			System.out.println("Stock: "+celda1.getStock());
			System.out.println("La celda no tiene producto");
		}
		if(celda2.getProducto() != null){
			System.out.println("\nCelda: "+celda2.getCodigo());
			System.out.println("Stock: "+celda2.getStock());
			System.out.println("Nombre producto: "+celda2.getProducto().getNombre());
			System.out.println("Precio producto: "+celda2.getProducto().getPrecio());
			System.out.println("Codgio Producto: "+celda2.getProducto().getCodigo());
		}else{
			System.out.println("\nCelda: "+celda2.getCodigo());
			System.out.println("Stock: "+celda2.getStock());
			System.out.println("La celda no tiene producto");
		}	
		if(celda3.getProducto() != null){
			System.out.println("\nCelda: "+celda3.getCodigo());
			System.out.println("Stock: "+celda3.getStock());
			System.out.println("Nombre producto: "+celda3.getProducto().getNombre());
			System.out.println("Precio producto: "+celda3.getProducto().getPrecio());
			System.out.println("Codgio Producto: "+celda3.getProducto().getCodigo());
		}else{
			System.out.println("\nCelda: "+celda3.getCodigo());
			System.out.println("Stock: "+celda3.getStock());
			System.out.println("La celda no tiene producto");
		}	
		if(celda4.getProducto() != null){
			System.out.println("\nCelda: "+celda4.getCodigo());
			System.out.println("Stock: "+celda4.getStock());
			System.out.println("Nombre producto: "+celda4.getProducto().getNombre());
			System.out.println("Precio producto: "+celda4.getProducto().getPrecio());
			System.out.println("Codgio Producto: "+celda1.getProducto().getCodigo());
		}else{
			System.out.println("\nCelda: "+celda4.getCodigo());
			System.out.println("Stock: "+celda4.getStock());
			System.out.println("La celda no tiene producto");
		}	
	}
	public Producto buscarProductoEnCelda(String codigo){
		if(celda1.getCodigo().equals(codigo)){
			return celda1.getProducto();
		}else if(celda2.getCodigo().equals(codigo)){
			return celda2.getProducto();
		}else if(celda3.getCodigo().equals(codigo)){
				return celda3.getProducto();
		}else if(celda4.getCodigo().equals(codigo)){
			return celda4.getProducto();
		}else{
			return null;
		}	
	}
	public double consultarPrecio(String codigo){
		if(celda1.getCodigo().equals(codigo)){
			return celda1.getProducto().getPrecio();
		}else if(celda2.getCodigo().equals(codigo)){
			return celda2.getProducto().getPrecio();
		}else if(celda3.getCodigo().equals(codigo)){
				return celda3.getProducto().getPrecio();
		}else if(celda4.getCodigo().equals(codigo)){
			return celda4.getProducto().getPrecio();
		}else{
			return 0;
		}	
	}
	public Celda buscarCeldaProducto(String codigo){
		if(celda1.getProducto()!=null&&  celda1.getProducto().getCodigo().equals(codigo)){
			return celda1;
		}else if(celda2.getProducto()!=null&&celda2.getProducto().getCodigo().equals(codigo)){
			return celda2;
		}else if(celda3.getProducto()!=null&&celda3.getProducto().getCodigo().equals(codigo)){
			return celda3;
		}else if(celda4.getProducto()!=null&&celda4.getProducto().getCodigo().equals(codigo)){
			return celda4;
		}else{
			return null;
		}
	}
	public void incrementarProductos(String codigo, int itemsincremento){
		Celda celdaEncontrada=buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(itemsincremento);
	}
	public void vender(String codigo){
		if(celda1.getCodigo().equals(codigo)){
			celda1.setStock(celda1.getStock()-1);
			saldo=saldo+celda1.getProducto().getPrecio();
		}else if(celda2.getCodigo().equals(codigo)){
			celda2.setStock(celda2.getStock()-1);
			saldo=saldo+celda2.getProducto().getPrecio();
		}else if(celda3.getCodigo().equals(codigo)){
			celda3.setStock(celda3.getStock()-1);
			saldo=saldo+celda3.getProducto().getPrecio();
		}else if(celda4.getCodigo().equals(codigo)){
			celda4.setStock(celda4.getStock()-1);
			saldo=saldo+celda4.getProducto().getPrecio();
		}
		mostrarProductos();
	}
	public double venderConCambio(String codigo, double valor){
		if(celda1.getCodigo().equals(codigo)){
			celda1.setStock(celda1.getStock()-1);
			saldo=(saldo-valor)*(-1);
			return saldo;
		}else if(celda2.getCodigo().equals(codigo)){
			celda2.setStock(celda2.getStock()-1);
			saldo=(saldo-valor)*(-1);
			return saldo;
		}else if(celda3.getCodigo().equals(codigo)){
			celda3.setStock(celda3.getStock()-1);
			saldo=(saldo-valor)*(-1);
			return saldo;
		}else if(celda4.getCodigo().equals(codigo)){
			celda4.setStock(celda4.getStock()-1);
			saldo=(saldo-valor)*(-1);
			return saldo;
		}else{
			return 0;
		}
		
	}
}
