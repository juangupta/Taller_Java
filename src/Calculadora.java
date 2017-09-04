
public class Calculadora 
{
	
	public Calculadora()
	{
		
	}
	
	public float sumar(float sumandos[])
	{
		float total = 0;
		for (int i = 0; i < sumandos.length; i++)
		{
			total = total + sumandos[i];
		}
		return total;
	}
	
	public float restar (float minuendo, float sustraendos[])
	{
		float resto = minuendo;
		for (int i = 0; i < sustraendos.length; i++)
		{
			resto = resto - sustraendos[i];
		}
		
		return resto;
	}
	
	public float multiplicar (float factores[])
	{
		float producto = 1;
		for (int i = 0; i < factores.length; i++)
		{
			producto = producto * factores[i];
		}
		
		return producto;
	}
	
	public float dividir (float dividendo, float divisores[])
	{
		float cociente = dividendo;
		for (int i = 0; i < divisores.length; i++)
		{
			if (divisores[i] != 0)
			{
				cociente = cociente / divisores[i];	
			}
			else
			{
				throw new ArithmeticException("No se permite divisores iguales a cero");
			}
			
		}
		
		return cociente;
	}

}
