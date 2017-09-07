import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

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
	
	public double CalcularNomina()
	{
		Double total = 0.0;
		Iterator<HashMap.Entry<Integer, Empleado>> entries = this.empleados.entrySet().iterator();
		while (entries.hasNext()) 
		{
			 HashMap.Entry<Integer, Empleado> empl = entries.next();
			 
			 //System.out.println("Empleado: " + empl.getValue().getNombre() + " Salario: " + empl.getValue().getCargo().getSalario());
			 total = total + empl.getValue().getCargo().getSalario();
		}
		return total;
	}
	
	

}
