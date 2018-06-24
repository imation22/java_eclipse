package feladatok;
//18.	Írj egy programot, mely egy valós tömb elemei közül meghatározza mekkora a második legnagyobb érték! 
public class feladat_18 {

	public static void main(String[] args) {
		int[] tomb = new int[] {5,2,8,1234,4566,13,51,89,9999,15,2134,54};
		int legnagyobb = 0;
		int masodiklegnagyobb = 0;
		for (int i = 0; i < tomb.length; i++) {
			for (int j = 1; j < tomb.length; j++) {
				if(tomb[i]>tomb[j]) {
					if(legnagyobb < tomb[i]) {
						masodiklegnagyobb = legnagyobb;
						legnagyobb = tomb[i];
					}
				}
			}
			
		}
		System.out.println(legnagyobb+" "+masodiklegnagyobb);

	}

}
