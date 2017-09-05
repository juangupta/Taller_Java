
public class Empleado {
	
	String nombre;
	String documento;
	Cargo cargo;
	
	public Empleado(String nombre, String documento, Cargo cargo)
	{
		this.nombre = nombre;
		this.documento = documento;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
