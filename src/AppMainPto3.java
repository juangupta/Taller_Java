import java.util.ArrayList;

public class AppMainPto3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int number;
		int numberAdd;
		int numberRemove;
		
		int count = (int) Math.floor(Math.random()*(10-1+1)+1);
		for (int i = 0; i < count; i++)
		{
			number = (int) Math.floor(Math.random()*(99-1+1)+1);
			numbers.add(number);
		}
		MathHelper math = new MathHelper(numbers);
		
		//numberRemove = (int) Math.floor(Math.random()*(99-1+1)+1);
		int index = (int) Math.floor(Math.random()*(count-1+1)+1);
		numberRemove = numbers.get(index);
		System.out.println("Eliminar " + numberRemove);
		math.removeNumber(numberRemove);
		
		numberAdd = (int) Math.floor(Math.random()*(99-1+1)+1);
		math.addNumber(numberAdd);
		
		

	}

}
