package cours;
import java.util.ArrayList;
import java.util.Random;

public class TP1_EX3 {
	
	public static int[] tabINtab (int[] intArray) {
		
		ArrayList<Integer> MyList = new ArrayList<Integer>();
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] >= 0)  {
				MyList.add(intArray[i]);
			}
		}
		int[] tab = new int[MyList.size()];
		for(int j = 0; j < MyList.size(); j++) {
			tab[j] = MyList.get(j);
		}
		
		return tab;
	}

	public static void main(String[] args) {
		
		int[] toto = new int[10];
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			toto[i] = rand.nextInt(100) - 50;
		}
		
		int[] tata = tabINtab(toto);

		System.out.println("La longueur du tableau est de " + tata.length);

	}

}
