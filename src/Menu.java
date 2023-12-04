import Datos.Cliente;
import Datos.Producto;
import Ejercicios.*;

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
		String codigo_producto,nombre,gama,dimensiones,proveedor,descripcion;
		int cantidad_en_stock;
		double precio_venta,precio_proveedor;

		/*do {
			do {

			}while(ValidationAlumno.validationNreDuplicity(nre));


		}while (ValidatonProducto.validation(dni,nombre,apellido1,apellido2,tipo_via,nombre_via,numero,escalera,piso,puerta,cp,pais,tlfn_fijo,tlfn_movil,email,fecha_nac,tutor));
*/
		System.out.println("CODIGO_PRODUCTO");
		codigo_producto = scProdcuto.nextLine();
		System.out.println("NOMBRE");
		nombre = scProdcuto.nextLine();
		System.out.println("GAMA");
		gama = scProdcuto.nextLine();
		System.out.println("DIMENSIONES");
		dimensiones = scProdcuto.nextLine();
		System.out.println("PROVEEDOR");
		proveedor = scProdcuto.nextLine();
		System.out.println("DESCRIPCION");
		descripcion = scProdcuto.nextLine();
		System.out.println("CANTIDAD EN STOCK");
		cantidad_en_stock = scProdcuto.nextInt();
		scProdcuto.nextLine();
		System.out.println("PRECIO VENTA");
		precio_venta = scProdcuto.nextDouble();
		scProdcuto.nextLine();
		System.out.println("PRECIO PROVEEDOR");
		precio_proveedor = scProdcuto.nextDouble();
		scProdcuto.nextLine();

		Producto producto = new Producto(codigo_producto,nombre,gama,dimensiones,proveedor,descripcion,cantidad_en_stock,precio_venta,precio_proveedor);
		System.out.println(ejercicio2.insert(producto));
	}

	public static void Ejercicio3() {
	}

	public static void Ejercicio4() {
	}

	public static void Ejercicio5() {
	}
}
