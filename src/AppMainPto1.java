
public class AppMainPto1 {

	public static void main(String[] args) {
		
		Calculadora miCalculadora = new Calculadora();
		
		//SUMA
		float[] sumandos = {1,5,9,10};
		float suma = miCalculadora.sumar(sumandos);
		System.out.println("\nSuma");
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
		
		//RESTA
		
		float minuendo = 30;
		float[] sustraendos = {1,5,9,10};
		float resta = miCalculadora.restar(minuendo, sustraendos);
		System.out.println("\nResta");
		System.out.println(minuendo);
		for (int i = 0; i < sustraendos.length; i++)
		{
				System.out.println("-" + sustraendos[i]);

			
		}
		
		System.out.println("=" + resta);
		
		//MULTIPLICACION
		
		float[] factores = {1,5,9,10};
		float producto = miCalculadora.multiplicar(factores);
		System.out.println("\nMultiplicacion");
		for (int i = 0; i < factores.length; i++)
		{
			if (i == factores.length-1)
			{
				System.out.println(factores[i]);				
			}
			else
			{
				System.out.println(factores[i] + "X");
			}

			
		}
		
		System.out.println("=" + producto);
		
		//DIVISION
		
				float dividendo = 30;
				float[] divisores = {2,5};
				float cociente;
				try
				{
					cociente = miCalculadora.dividir(dividendo, divisores);	
				}
				catch (Exception e)
				{
					System.out.println(e);
					return;
				}
				System.out.println("\nDivision");
				System.out.println(dividendo);
				for (int i = 0; i < divisores.length; i++)
				{
						System.out.println("/" + divisores[i]);

					
				}
				
				System.out.println("=" + cociente);
		
	}

}
