package feladatok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//10.	�rj egy programot, mely egy file tartalm�t ford�tott sorrendben a k�perny�re �rja!
public class feladat_10 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			String text = br.readLine();
			System.out.println(text);
			int hossz = text.length();
			
			for (int i = 0; i < text.length(); i++) {
				System.out.print(text.charAt(hossz-1));
				hossz--;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
