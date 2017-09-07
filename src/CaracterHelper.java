import java.util.HashMap;

public class CaracterHelper {
	
	ConsonanteJ j;
	VocalU u;
	VocalA a;
	ConsonanteN n;
	HashMap<String, CaracterDibujable> letras;
	
	public CaracterHelper()
	{
		letras = new HashMap<String, CaracterDibujable>();
		j = new ConsonanteJ();
		letras.put("j", j);
		u = new VocalU();
		letras.put("u", u);
		a = new VocalA();
		letras.put("a", a);
		n = new ConsonanteN();
		letras.put("n", n);
	}
	
	public void dibujar(String palabra)
	{
		char[] charArray = palabra.toCharArray();
		for (int i = 0; i < charArray.length; i++)
		{
			String key = String.valueOf(Character.toLowerCase(charArray[i]));
			if (letras.containsKey(key))
			{
				CaracterDibujable letra = letras.get(key);
				System.out.println(letra.dibujar());
			}
		}
	}
	

}
