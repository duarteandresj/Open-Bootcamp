package introducción_a_la_programacion_Tema4;

public class EstructurasControl {
	/*
	 * Usando un if, crear una condición que compare si la variable numeroIf es
	 * positivo, negativo, o 0. Pista: Los números inferiores a 0 son negativos y
	 * los superiores, positivos.
	 */

	public static void main(String[] args) {
		int numeroIf = 5;
		String mensaje = "";
		if (numeroIf < 0) {
			mensaje = "es negativo";
		} else if (numeroIf == 0) {
			mensaje = "es cero";

		} else {
			mensaje = "es positivo";
		}
		System.out.println("El numeroIf: " + numeroIf + " " + mensaje);
		/*
		 * Crea un bucle While, este bucle tendrá que tener como condición que la
		 * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
		 * bucle deberá: Incrementar el valor de la variable en uno cada vez que se
		 * ejecute. Mostrarlo por pantalla cada vez que se ejecute.
		 */

		System.out.println();
		int numeroWhile = 0;
		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println("El numeroWhile es: " + numeroWhile);
		}
		/*
		 * Para el bucle Do While, deberás crear la misma estructura que en el While,
		 * pero solo se debe ejecutar una vez.
		 */
		System.out.println();
		numeroWhile = 253;
		do {
			System.out.println("Como quiero que se ejecute una sola vez pongo una condicion falsa");
			System.out.println("El numero doWhile es: " + numeroWhile);
			numeroWhile++;
		} while (false);

		/*
		 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
		 * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
		 * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
		 * pantalla.
		 */
		System.out.println();
		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("El numeroFor es: " + numeroFor);
		}

		/*
		 * Por último, para el Switch, deberás crear la variable estacion, y distintos
		 * case para las cuatro estaciones del año. Dependiendo del valor de la variable
		 * estacion se deberá mandar un mensaje por consola informando de la estación en
		 * la que está. También habrá que poner un default para cuando el valor de la
		 * variable no sea una estación.
		 */
		System.out.println();
		String estacion = "Verano  ";
		switch (estacion.trim().toLowerCase()) {
		case "verano": {
			System.out.println("Estamos en verano");
			break;
		}
		case "otonio": {
			System.out.println("Estamos en otoño");
			break;
		}case "invierno": {
			System.out.println("Estamos en invierno");
			break;
		}case "primavera": {
			System.out.println("Estamos en primavera");
			break;
		}
		default:
			System.out.println("El valor ("+estacion+") no es aceptado como opcion");

		}
	}
}
