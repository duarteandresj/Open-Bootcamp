package introducción_a_la_programacion_Tema3;

/*Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
.*/
public class ParteUno {
public static void main(String[] args) {
	int resultado=suma(1,20,30);//51
	System.out.println(resultado);
}
public static int suma(int numero1,int numero2, int numero3) {
	return numero1+numero2+numero3;
}

}
