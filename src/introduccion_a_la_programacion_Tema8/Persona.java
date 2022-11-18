package introduccion_a_la_programacion_Tema8;

public class Persona {
	private int edad;
	private String nombre;
	private String telefono;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		
		this.telefono = telefono;
	}

	public static void main(String[] args) {
		Persona nuevaPersona = new Persona();

		nuevaPersona.setEdad(25);
		nuevaPersona.setNombre("Pepito");
		nuevaPersona.setTelefono("+5491112345678");

		System.out.println("Edad: " + nuevaPersona.getEdad());
		System.out.println("Nombre: " + nuevaPersona.getNombre());
		System.out.println("Telefono: " + nuevaPersona.getTelefono());
	}
}
