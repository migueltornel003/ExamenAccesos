package Validation;

import Ejercicios.Ejercicio3;

import java.util.List;

public class ValidationOficina {


	public static boolean OficinaExist(String codigoOficina) {
		Ejercicio3 ejercicio3 = new Ejercicio3();
		boolean isExist = false;

		List<String> oficinas = ejercicio3.selectOficinas();

		for (String oficina:oficinas) {
			if (oficina.equals(codigoOficina)){
				isExist = true;
				break;
			}
		}

		return isExist;
	}
}
