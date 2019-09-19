package cours;
import java.util.ArrayList;
import java.util.Scanner;

public class TD1_EX4 {
	
	public static boolean estVoyelle (char lettre) {
		boolean voyelle = false;
		char[] voyelles = new char[] {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i < 5; i++) {
			if(lettre == voyelles[i]) {
				voyelle = true;
			}
		}
		return voyelle;
	}
	
	public static String getStringRepresentation(ArrayList<Character> list) {    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	
	public static void maMethode (String chaine) {
		
		ArrayList<String> MyList = new ArrayList<String>();
		int i = 0;
		
		while(i < chaine.length()) {
			ArrayList<Character> temp = new ArrayList<Character>();
			boolean voyelle = false;
			while (!voyelle) {
				if(i == chaine.length()) {
					break;
				}
				
				temp.add(chaine.charAt(i));
				voyelle = estVoyelle(chaine.charAt(i));
				if(!voyelle) {i++;}
			}
			MyList.add(getStringRepresentation(temp));
			i++;
		}
		
		//print the serelized
		for(int j = 0; j < MyList.size(); j++) {
			System.out.println(MyList.get(j));
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre String ? : ");
		String chaine = sc.next();
		maMethode(chaine);
		sc.close();
		
		}

}
