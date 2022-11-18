package introduccion_a_la_programacion_Tema9;

public class Trabajador extends Persona {
	private double salario;
	
	Trabajador(int edad,String nombre,String telefono,double salario){
		super(edad,nombre,telefono);
		this.salario=salario;
		}
	@Override
	public String toString() {
		return "Nombre: "+ super.nombre +" Edad: "+super.edad+" Telefono: "+super.telefono+" Salario: "+this.salario;

	}
	public static void main(String[] args) {
		Trabajador pepito=new Trabajador(25,"Jose","+54111234567",3200.25);
		System.out.println(pepito);
	}

}
