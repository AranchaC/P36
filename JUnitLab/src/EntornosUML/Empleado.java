package EntornosUML;

public class Empleado extends Persona{
	private int sueldoBruto;

	public Empleado(String nombre, String apellidos, int fechaNacimiento, int sueldoBruto) {
		super(nombre, apellidos, fechaNacimiento);
		this.sueldoBruto = sueldoBruto;
	}

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(int sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	
	

}
