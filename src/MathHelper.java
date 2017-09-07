import java.util.ArrayList;

public class MathHelper {
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public MathHelper(ArrayList<Integer> numbers)
	{
		this.numbers = numbers;
		
	}
	
	public void addNumber(int number)
	{
		showNumbers("Estado Inicial  ");
		this.numbers.add(number);
		showNumbers("Numero Agregado ");
		sortNumbers();
		showNumbers("Ordenado        ");
		
	}
	
	public void removeNumber(int number)
	{
		showNumbers("Estado Inicial  ");
		int index = this.numbers.indexOf(number);
		if (index >= 0)
		{
			this.numbers.remove(index);	
		}	
		else
		{
			throw new NullPointerException("El número no existe en la lista");	
		}
		showNumbers("Número Eliminado");
		sortNumbers();
		showNumbers("Ordenado        ");
		
	}
	
	public void sortNumbers()
	{
		int i, j, aux;
        for(i=0;i<this.numbers.size()-1;i++)
             for(j=0;j<this.numbers.size()-i-1;j++)
                  if(this.numbers.get(j+1)<this.numbers.get(j)){
                     aux=this.numbers.get(j+1);
                     this.numbers.set(j+1, this.numbers.get(j));
                     this.numbers.set(j, aux);
             		 //showNumbers();
                  }	
	}
	
	public void showNumbers(String mensaje) 
	{
	System.out.println(mensaje + ": "+ this.numbers);	
	}
}
