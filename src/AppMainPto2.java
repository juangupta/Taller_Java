import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class AppMainPto2 {

	public static void main(String[] args) {
		
		int secuencia = 0;
		
		Cargo cargo1 = new Cargo(1, "Analista 1", 4000000.00);
		Cargo cargo2 = new Cargo(2, "Analista 2", 3500000.00);
		Cargo cargo3 = new Cargo(3, "Analista 3", 3000000.00);
		
		Empleado empleado1 = new Empleado("Pepe", "1037000000", cargo1);
		Empleado empleado2 = new Empleado("Yovinson", "1037000001", cargo2);
		Empleado empleado3 = new Empleado("Yuliney", "1037000002", cargo3);
		Empleado empleado4 = new Empleado("Estrella", "1037000003", cargo2);
		Empleado empleado5 = new Empleado("Caliman", "1037000004", cargo1);
		
		HashMap<Integer, Empleado> empleados = new HashMap<>();
		
		secuencia++;
		empleados.put(secuencia, empleado1);
		secuencia++;
		empleados.put(secuencia, empleado2);
		secuencia++;
		empleados.put(secuencia, empleado3);
		secuencia++;
		empleados.put(secuencia, empleado4);
		secuencia++;
		empleados.put(secuencia, empleado5);
		
		Nomina nomina = new Nomina(1, LocalDate.now());
		nomina.setEmpleados(empleados);
		Double totalNomina = nomina.CalcularNomina();
		Iterator<HashMap.Entry<Integer, Empleado>> entries = empleados.entrySet().iterator();
		while (entries.hasNext()) 
		{
			 HashMap.Entry<Integer, Empleado> empl = entries.next();
			 
			 System.out.println("Empleado: " + empl.getValue().getNombre() + " Salario: " + empl.getValue().getCargo().getSalario());
		}
		
		NumberFormat formatter = new DecimalFormat("#0.00"); 
		System.out.println("");
		System.out.println("Total a pagar: " + formatter.format(totalNomina));
	}

}
