package feladatok;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

//23.	Írj egy függvényt, mely két sztringet kap paraméterként és visszaadja hány karakterük egyezik meg! (például: „alma” és „álmatlan” -> 2 ; „sátortábor” és „bátorság” -> 5 ; „ágy”,„vágy” ->0
public class feladat_23_v4 {
	
	public static void main(String[] args) {
		String teszt= "ágy";
		String teszt1 = "vágy";
		String result1 = "";
		String result2 = "";
		int szamlalo = 0;
		int count = 0;
		
	    for (int i = 0; i < teszt1.length(); i++) {
	        if(!result1.contains(String.valueOf(teszt1.charAt(i)))) {
	        	result1 += String.valueOf(teszt1.charAt(i));
	        }
	    }
	    for (int i = 0; i < teszt.length(); i++) {
	        if(!result2.contains(String.valueOf(teszt.charAt(i)))) {
	        	result2 += String.valueOf(teszt.charAt(i));
	        }
	    }

		char []teszt2 = result1.toCharArray();
		char []teszt3 = result2.toCharArray();
		
		Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();

		for (int i = 0; i < teszt2.length; i++) {
			if(!hm.keySet().contains(teszt2[i])) { //key jelenleg a betû
				hm.put(teszt2[i], 1);
			}
			else{
				count = hm.get(teszt2[i]);
				hm.put(teszt2[i], ++count);
			}
		}
		
		for (int i = 0; i < teszt3.length; i++) {
			if(hm.keySet().contains(teszt2[i])) {
				szamlalo++;
			}			
		}
		System.out.println(szamlalo);
		
	}
}
