package feladatok;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//13.	Írj egy programot, mely szöveg file beolvasása során megállapítja melyik karakter hányszor fordult elõ a file-ban! (javasolt megoldás: HashTable)
public class feladat_13_v2 {

	public static void main(String[] args) {
		String teszt= "ez egy teszt";
		String teszt1 = "bátorság";
		int szamlalo = 0;
		
		 Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();
		 for (char ch : teszt.toCharArray())
			 hm.put(ch, hm.containsKey(ch) ? (hm.get(ch) + 1) : 1);

			System.out.println(hm);

			 
		    /*Set<Map.Entry<Character, Integer>> set = hm.entrySet();

		    for (Map.Entry<Character, Integer> me : set) {
		      System.out.print(me.getKey() + ": ");
		      System.out.println(me.getValue());
		    }*/

	}

}
