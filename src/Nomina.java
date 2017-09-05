import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class Nomina {
	
	int id;
	LocalDate fecha;
	HashMap empleados;
	
	public Nomina(int id, LocalDate fecha) 
	{
		this.id = id;
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public HashMap getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashMap empleados) {
		this.empleados = empleados;
	}
	
	public void CalcularNomina()
	{
		
	}
	
	

}
