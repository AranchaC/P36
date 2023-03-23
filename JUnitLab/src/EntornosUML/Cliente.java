package EntornosUML;

public class Cliente extends Persona {
	private int telefono;

	public Cliente(String nombre, String apellidos, int fechaNacimiento, int telefono) {
		super(nombre, apellidos, fechaNacimiento);
		this.telefono = telefono;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	

}
