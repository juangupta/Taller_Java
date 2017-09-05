
public class Cargo {
	
	private int id;
	private String descripcion;
	private Double salario;
	
	public Cargo(int id, String descripcion, Double salario)
	{
		this.id = id;
		this.descripcion = descripcion;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}
	

	public String getDescripcion() {
		return descripcion;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
