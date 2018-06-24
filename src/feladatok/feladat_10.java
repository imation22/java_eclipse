package feladatok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//10.	Írj egy programot, mely egy file tartalmát fordított sorrendben a képernyõre írja!
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
