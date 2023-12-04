import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;

		do {
			do {
				System.out.println("QUE OPCIÓN DESEAS ELEGIR:\n" +
						"EJERCICIO 1 - 1\n"+
						"EJERCICIO 2 - 2\n"+
						"EJERCICIO 3 - 3\n"+
						"EJERCICIO 4 - 4\n"+
						"EJERCICIO 5 - 5\n"+
						"SALIR - 0");
				option = sc.nextInt();
				sc.nextLine();
			}while (option<0 || option>5);

			switch (option){
				case 1:
					Menu.Ejercicio1();
					break;
				case 2:
					Menu.Ejercicio2();
					break;
				case 3:
					Menu.Ejercicio3();
					break;
				case 4:
					Menu.Ejercicio4();
					break;
				case 5:
					Menu.Ejercicio5();
					break;
				case 0:
					System.out.println("Se ha salido exitosamente!");
			}
		}while (option != 0);
	}
}