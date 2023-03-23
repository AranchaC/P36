package EntornosUML;

public class Persona {
	private String nombre;
	private String apellidos;
	protected int fechaNacimiento;
	
	public Persona(String nombre, String apellidos, int fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	

}
