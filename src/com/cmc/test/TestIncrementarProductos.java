package com.cmc.test;

import com.cmc.componentes.Producto;
import com.cmc.maquina.MaquinaDulces;

public class TestIncrementarProductos {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("Papitas",0.85,"KE34");
		maquina.cargarProducto(producto, "B1", 4);
		
		maquina.mostrarProductos();
		
		maquina.incrementarProductos("KE34", 8);
		
		System.out.println("------------LUEGO DEL INCREMENTO-------------");
		
		maquina.mostrarProductos();
	}

}
