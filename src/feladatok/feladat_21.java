package feladatok;

import java.text.DecimalFormat;
import java.text.NumberFormat;

//21.	�rj egy m�rt�kegys�g konvert�l� f�ggv�nyt, amely h�rom param�tert kap! Az els� egy h�m�rs�klet �rt�k, a m�sodik azt jelzi, hogy milyen m�rt�kegys�gben van ez megadva (�C�: Celsius, �F�: Fahrenheit, �K�: Kelvin), a harmadik param�ter pedig azt jelzi milyen m�rt�kegys�gre akarjuk �tkonvert�lni. (K = C+273,15; F = 9/5*C+32) 
public class feladat_21 {
 	//(K = C+273,15; F = 9/5*C+32) 104F 40C 313.15K
	public static void main(String[] args) {
		
		mertekegysegkonvertalo(104, "F", "C");
	}

	private static void mertekegysegkonvertalo(double ertek, String mertekEgyseg, String celmertekEgyseg) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		double eredmeny = 0;

		if(mertekEgyseg == "C") {
			switch (celmertekEgyseg) {
			case "F":
				eredmeny = (((double)9/5)*ertek)+32;
				break;
			case "K":
				eredmeny = ertek+273.15;
				break;
			}
		}
		
		if (mertekEgyseg == "F") {
			switch (celmertekEgyseg) {
			case "C":
				eredmeny = (ertek-32)/1.8000;
				break;
			case "K":
				eredmeny = (ertek+459.67)*(double)5/9;
				break;	
			}
		}
		
		if (mertekEgyseg == "K") {
			switch (celmertekEgyseg) {
			case "C":
				eredmeny = ertek-273.15;
				break;
			case "F":
				eredmeny = (ertek*(double)9/5)-459.67;
				break;	
			}
		}
		System.out.println(formatter.format(eredmeny));
	}

}
