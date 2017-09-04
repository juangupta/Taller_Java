
public class Calculadora 
{
	
	public Calculadora()
	{
		
	}
	
	public float suma(int sumandos[])
	{
		float total = 0;
		for (int i = 0; i < sumandos.length; i++)
		{
			total = total + sumandos[i];
		}
		return total;
	}

}
