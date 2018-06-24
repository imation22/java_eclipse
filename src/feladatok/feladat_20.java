package feladatok;
//20.	Írj egy programot, mely egy N elemû tömbrõl megmondja, hogy melyik 3 elem összege a legkisebb! buborékos rendezéssel megvalósítva
public class feladat_20 {

	public static void main(String[] args) {
		int[] tomb = new int[] {13,8,14566,234,};
		int tmp;
		for (int i = tomb.length-1; i > 0; i--) { //3 indul-->1
			for (int j = 0; j < i; j++) {//0
				if(tomb[j]>tomb[j+1]) {  
					tmp = tomb[j];
					tomb[j] = tomb[j+1];  
					tomb[j+1] = tmp; 
				}
			}
		}
		for (int k = 0; k < 3; k++) {
			System.out.println(tomb[k]);
		}
		
	}

}
