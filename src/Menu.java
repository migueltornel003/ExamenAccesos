import Datos.Cliente;
import Ejercicios.*;

import java.util.List;

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
	}

	public static void Ejercicio3() {
	}

	public static void Ejercicio4() {
	}

	public static void Ejercicio5() {
	}
}
