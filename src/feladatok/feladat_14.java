package feladatok;
//14.	�rj egy programot, mely param�terk�nt megkapja az egyik nap �jf�l �ta eltelt percek sz�m�t (mely ak�r t�bb milli� is lehet), �s megmondja, hogy d�lel�tt vagy d�lut�n van! 
public class feladat_14 {

	public static void main(String[] args) {
				
		datum(600);
		
	}

	private static void datum(int elteltPerc) {
		String eredmeny = "";
		int nap =720;
		
		int datum = elteltPerc/nap;
		if(datum%2==0) {
			System.out.println("d�lel�tt");
		}
		else {
			System.out.println("d�lut�n");
		}		
	}
	
	

}
