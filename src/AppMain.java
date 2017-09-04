
public class AppMain {

	public static void main(String[] args) {
		
		Calculadora miCalculadora = new Calculadora();
		int[] sumandos = {1,5,9,10};
		float suma = miCalculadora.suma(sumandos);
		for (int i = 0; i < sumandos.length; i++)
		{
			if (i == sumandos.length-1)
			{
				System.out.println(sumandos[i]);				
			}
			else
			{
				System.out.println(sumandos[i] + "+");
			}

			
		}
		
		System.out.println("=" + suma);
	}

}
