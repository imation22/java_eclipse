package feladatok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*11.	�rj egy programot, mely egy sz�veg file tartalm�t a k�perny�re �rja �gy, hogy egyik sor sem lesz
40 karaktern�l hosszabb (sz�k�z�kkel egy�tt), viszont a file minden szav�nak els� �s utols� karaktere ugyanabban
a sorban kell lennie! ( Feltessz�k, hogy a sz�veg minden szava r�videbb 30 karaktern�l.) Az-az egy sz� nem lehet
k�t soros*/

public class feladat_11 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("text2.txt"));
			String text = br.readLine();
			
			int hossz = text.length();
			int valtozo = 40;
			System.out.println(text.toCharArray());
			while (hossz==valtozo) {
				
				System.out.println("teszt");
			}
			
			
			if(hossz==valtozo) {
				System.out.println("teszt");
				text.concat("\n");
			}
			System.out.println(text);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
