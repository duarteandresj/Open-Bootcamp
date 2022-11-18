package introduccion_a_la_programacion_Tema9;

public class Cliente extends Persona {
	private double credito;
	
	Cliente(int edad,String nombre,String telefono,double credito){
		super(edad,nombre,telefono);
		this.credito=credito;
		}
	@Override
	public String toString() {
		return "Nombre: "+ super.nombre +" Edad: "+super.edad+" Telefono: "+super.telefono+" Credito: "+this.credito;

	}
	public static void main(String[] args) {
		Cliente pepito=new Cliente(25,"Pedro","+54111234567",200.25);
		System.out.println(pepito);
	}

}
