package feladatok;
//14.	Írj egy programot, mely paraméterként megkapja az egyik nap éjfél óta eltelt percek számát (mely akár több millió is lehet), és megmondja, hogy délelõtt vagy délután van! 
public class feladat_14 {

	public static void main(String[] args) {
				
		datum(600);
		
	}

	private static void datum(int elteltPerc) {
		String eredmeny = "";
		int nap =720;
		
		int datum = elteltPerc/nap;
		if(datum%2==0) {
			System.out.println("délelõtt");
		}
		else {
			System.out.println("délután");
		}		
	}
	
	

}
