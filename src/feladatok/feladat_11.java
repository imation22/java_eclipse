package feladatok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*11.	Írj egy programot, mely egy szöveg file tartalmát a képernyõre írja úgy, hogy egyik sor sem lesz
40 karakternél hosszabb (szóközökkel együtt), viszont a file minden szavának elsõ és utolsó karaktere ugyanabban
a sorban kell lennie! ( Feltesszük, hogy a szöveg minden szava rövidebb 30 karakternél.) Az-az egy szó nem lehet
két soros*/

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
