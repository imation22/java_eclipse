package feladatok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.spi.TimeZoneNameProvider;

import javax.xml.bind.ParseConversionEvent;

//8.	�rj egy programot, mely beolvas egy 16-os sz�mrendszerbeli sz�mot tartalmaz� sztringet �s ki�rja a sz�mot 10-es sz�mrendszerben! 
public class feladat_8 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Double tizehat = 16.0;
		String ertek;
		Double eredmeny = 0.0;
		try {
			ertek = br.readLine();
			int hossz = ertek.length();
			
			for (int i = 0; i < ertek.length(); i++) {
				//System.out.println(ertek.charAt(hossz-1));
				String szamok = Character.toString(ertek.charAt(hossz-1));
				
				Double valtozo = Math.pow(16, i);
				eredmeny += valtozo*Integer.parseInt(szamok);
				hossz--;		
			}
			System.out.println(eredmeny);
		} catch (Exception e) {
			
			e.printStackTrace();
		}	

	}

}
