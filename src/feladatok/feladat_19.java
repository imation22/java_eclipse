package feladatok;
//19.	�rj egy programot, mely egy NxN-es val�s m�trix f��tl�ja alatti elemek �sszeg�t hat�rozza meg!
public class feladat_19 {

	public static void main(String[] args) {
		int eredmeny = 0;
		int[][] tomb = {
                { 1,4,6 },
                { 3,1,8 },
                { 3,1,8 },};
		for (int i = 0; i < tomb.length; i++) { //sorok
			for (int j = 0; j < tomb[i].length; j++) {//oszlopok
				//System.out.println(tomb[i][j]);
				if(i==j) {
					eredmeny += tomb[i][j];
				}
			}
		}
		System.out.println(eredmeny);

	}

}
