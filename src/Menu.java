import Datos.*;
import Ejercicios.*;
import Validation.ValidationOficina;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void Ejercicio1() {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		List<Cliente> clientes = ejercicio1.selectCliente();

		clientes.forEach(cliente -> {
			System.out.println(cliente);
			System.out.println();
		});
	}

	public static void Ejercicio2() {
		Ejercicio2 ejercicio2 = new Ejercicio2();
		Scanner scProdcuto = new Scanner(System.in);
		String codigo_producto,nombre,gama="",dimensiones,proveedor,descripcion;
		int cantidad_en_stock;
		double precio_venta,precio_proveedor;
		List<Gama> gamas = ejercicio2.selectGama();
		int option;

		System.out.println("CODIGO_PRODUCTO");
		codigo_producto = scProdcuto.nextLine();
		System.out.println("NOMBRE");
		nombre = scProdcuto.nextLine();
		gamas.forEach(gamaProducto -> {
			System.out.println(gamaProducto);
			System.out.println();

		});
		do {
			System.out.println("GAMA(INTRODUCE NUMERO):\n" +
					"1 - Aromáticas\n" +
					"2 - Frutales\n" +
					"3 - Herbaceas\n" +
					"4 - Herramientas\n" +
					"5 - Ornamentales");
			option = scProdcuto.nextInt();
		}while (option<1 || option > 5);
		scProdcuto.nextLine();
		switch (option){
			case 1:
				gama = "Aromáticas";
				break;
			case 2:
				gama = "Frutales";
				break;
			case 3:
				gama = "Herbaceas";
				break;
			case 4:
				gama = "Herramientas";
				break;
			case 5:
				gama = "Ornamentales";
				break;
		}
		System.out.println("DIMENSIONES");
		dimensiones = scProdcuto.nextLine();
		System.out.println("PROVEEDOR");
		proveedor = scProdcuto.nextLine();
		System.out.println("DESCRIPCION");
		descripcion = scProdcuto.nextLine();
		System.out.println("CANTIDAD EN STOCK");
		cantidad_en_stock = scProdcuto.nextInt();
		scProdcuto.nextLine();
		do {
			System.out.println("PRECIO VENTA");
			precio_venta = scProdcuto.nextDouble();
			scProdcuto.nextLine();
			System.out.println("PRECIO PROVEEDOR");
			precio_proveedor = scProdcuto.nextDouble();
			scProdcuto.nextLine();
		}while (precio_proveedor>precio_venta);

		Producto producto = new Producto(codigo_producto,nombre,gama,dimensiones,proveedor,descripcion,cantidad_en_stock,precio_venta,precio_proveedor);
		System.out.println(ejercicio2.insert(producto));
	}

	public static void Ejercicio3() {
		Ejercicio3 ejercicio3 = new Ejercicio3();
		Scanner scOficina = new Scanner(System.in);
		String codigo_oficina,telefono;

		System.out.println("CODIGO_OFICINA");
		codigo_oficina = scOficina.nextLine();
		System.out.println("TELEFONO");
		telefono = scOficina.nextLine();

		if (ValidationOficina.OficinaExist(codigo_oficina)){
			Oficina oficina = new Oficina(codigo_oficina,telefono);
			System.out.println(ejercicio3.update(oficina));
		}else{
			System.out.println("No se ha modificado nada porque el código de oficina no existe");
		}


	}

	public static void Ejercicio4() {
		Ejercicio4 ejercicio4 = new Ejercicio4();
		Scanner scPedido = new Scanner(System.in);
		Date fechaInicio,fechaFinal;

		System.out.println("FECHA DE INICIO");
		fechaInicio = Date.valueOf(scPedido.nextLine());
		System.out.println("FECHA DE FIN");
		fechaFinal = Date.valueOf(scPedido.nextLine());

		List<Pedido> pedidos = ejercicio4.selectPedidos(fechaInicio,fechaFinal);

		if (!pedidos.isEmpty()){
			pedidos.forEach(pedido -> {
				System.out.println(pedido);
				System.out.println();
			});
		}else{
			System.out.println("No se han encontrado resultados");
		}
	}

	public static void Ejercicio5() {

	}
}
