package feladatok;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//13.	�rj egy programot, mely sz�veg file beolvas�sa sor�n meg�llap�tja melyik karakter h�nyszor fordult el� a file-ban! (javasolt megold�s: HashTable)
public class feladat_13_v2 {

	public static void main(String[] args) {
		String teszt= "ezTegyTteszt";
		String teszt1 = "b�tors�g";
		int szamlalo = 0;
		int count = 0;
		char []teszt2 = teszt.toCharArray();
		
		Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();

		for (int i = 0; i < teszt2.length; i++) {
			if(!hm.keySet().contains(teszt2[i])) { //key jelenleg a bet�
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
	}

}
