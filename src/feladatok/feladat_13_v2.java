package feladatok;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//13.	Írj egy programot, mely szöveg file beolvasása során megállapítja melyik karakter hányszor fordult elõ a file-ban! (javasolt megoldás: HashTable)
public class feladat_13_v2 {

	public static void main(String[] args) {
<<<<<<< HEAD
		String teszt= "ez egy teszt";
		String teszt1 = "bátorság"
				;
=======
		String teszt= "ezTegyTteszt";
		String teszt1 = "bátorság";
>>>>>>> 286b1d8db74afbfc9a085f28a3aec23355838fb4
		int szamlalo = 0;
		int count = 0;
		char []teszt2 = teszt.toCharArray();
		
<<<<<<< HEAD
		 Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();
		 for (char ch : teszt.toCharArray()) { 
			hm.put(ch, hm.containsKey(ch) ? (hm.get(ch) + 1):1);
		 	//System.out.println(hm.get(ch)+1);
		 	
		 }
			System.out.println(hm);
				
			
			
		    /*Set<Map.Entry<Character, Integer>> set = hm.entrySet();

		    for (Map.Entry<Character, Integer> me : set) {
		      System.out.print(me.getKey() + ": ");
		      System.out.println(me.getValue());
		    }*/

=======
		Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();

		for (int i = 0; i < teszt2.length; i++) {
			if(!hm.keySet().contains(teszt2[i])) { //key jelenleg a betû
				hm.put(teszt2[i], 1);
				System.out.println(hm);
			}
			else{
				count = hm.get(teszt2[i]);
				System.out.println(count);
				hm.put(teszt2[i], ++count);
			}
		}
		for (int i = 0; i < hm.size(); i++) {
				System.out.println(hm.);
			}
		
		
		
		//System.out.println(hm);
>>>>>>> 286b1d8db74afbfc9a085f28a3aec23355838fb4
	}

}
