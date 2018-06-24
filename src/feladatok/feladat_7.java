package feladatok;

import java.util.ArrayList;
import java.util.Collections;

public class feladat_7 {
	//7.	Írj egy eljárást, mely egy paraméterként kapott egész számot kettes számrendszerbeli számmá konvertálva ír ki! 

	public static void main(String[] args) {
		
		kettesSzamrandszer(1991);

	}

	private static void kettesSzamrandszer(int szam) {
		ArrayList szamok = new ArrayList();
		while(szam>=0) {
			szamok.add(szam%2);
			szam = szam/2;
			if(szam==0) {
				break;	
			}
		}
		Collections.reverse(szamok);
		System.out.println(szamok);
		
	}


}
