package introducción_a_la_programacion_Tema3;
/*Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto
*/

public class Coche {
public int numeroPuertas=0;

public void incrementarPuertas() {
	numeroPuertas++;
}
public void incrementarPuertas(int numero) {
	numeroPuertas+=numero;
}

public static void main(String[] args) {
	Coche miCoche=new Coche();
	miCoche.incrementarPuertas(1);
	
	System.out.println("El numero de puertas del coche es: " + miCoche.numeroPuertas);
}
}
