package feladatok;

public class feladat_4 {
	//Írj egy függvényt, amely egy egész számról eldönti, hogy a prím tényezõi között hány darab 2-es van és visszaadja ezt az értéket! Függvénnyel.

	public static void main(String[] args) {
		int szam = 70;
		int oszto= 2;
		int eredmeny = 0;
		
		while(szam>=1) {
			
			if(szam%oszto==0) {
				System.out.println("asd2");
				szam = szam/oszto;
			}
		}
				
	}

}
