package feladatok;

import java.util.Random;
//Írj egy programot, amely egy N elemet tartalmazó tömbrõl megmondja, hogy a szomszédos elemek között mekkora legnagyobb különbség! Függvénnyel!
//Írj egy programot, amely egy N elemet tartalmazó tömbrõl megmondja, hogy melyik két eleme között legkisebb a különbség! 

public class feladat_1 {

	public static void main(String[] args) {
		int[] array = tombGeneral(5);
		legnagyobbKulonbseg(array);
		legkisebbKulonbseg(array);		
	}
	
	
	
	public static int[] tombGeneral(int meret) {
		int[] array = new int[meret];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i]= rand.nextInt(10)+1;
			System.out.print(array[i]+" ");
		}
		return array;
	}

	public static int legnagyobbKulonbseg(int[] array) {
		int eredmeny = 0;
		
		for (int j = 0; j < array.length-1; j++) {
			if (eredmeny<array[j]-array[j+1]) {
				eredmeny = array[j]-array[j+1];
			}
			
		}
		System.out.println("\nA legnagyobb különbség a tömbben: " + eredmeny);
		return eredmeny;
	}
	
	
	public static int legkisebbKulonbseg(int[] array) {
		int eredmeny = 0;
		
		for (int j = 0; j < array.length-1; j++) {
			if (eredmeny>array[j]-array[j+1]) {
				eredmeny = array[j]-array[j+1];
			}
			
		}
		System.out.println("\nA legkisebb különbség a tömbben: " + eredmeny);
		return eredmeny;
	}
	
	
	
}

