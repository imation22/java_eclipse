package feladatok;

import java.util.Hashtable;

public class teszt_13_v4 {

	public static void main(String[] args) {
		String teszt= "sátortábor";
		int count = 0;
		
		char []teszt2 = teszt.toCharArray();
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
		System.out.println(hm);

	}

}
