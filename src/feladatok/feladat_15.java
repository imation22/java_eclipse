package feladatok;
//15.	Írj egy függvényt, mely paraméterként megkap egy idõpontot (év, hó, nap, óra, perc) és visszaadja, hogy az adott évnek hány százaléka telt el eddig az idõpontig szökõévek figyelembevételével! 
// 4-el osztható kivéve a 100-al, de a 400-al pedig igen 365 helyett 366 nap

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class feladat_15 {

	public static void main(String[] args) {
		
		evSzazaleka(2018,6,14,15,10);
	}

	private static void evSzazaleka(int ev, int ho, int nap, int ora, int perc) {
		double elteltSzazalek = 0;
		int rendEv = 525600;
		int szokEv = 527040;
		int eredmeny = 0;
		
		int[] simaEv = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] szokoEv = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		if(ev%400==0){
			for (int i = 0; i < ho-1; i++) {
				eredmeny+=szokoEv[i];
			}
				
			eredmeny = ((eredmeny*24)*60)+((nap*24)*60)+((ora*60)+14);
			elteltSzazalek = ((double)eredmeny/(double)szokEv)*100;
			System.out.println("Az év "+formatter.format(elteltSzazalek)+"%-a már eltelt.");
		}
		
		if((ev%4==0) && (ev%100)>0) {
			for (int i = 0; i < ho-1; i++) {
				eredmeny+=szokoEv[i];
			}
			eredmeny = ((eredmeny*24)*60)+((nap*24)*60)+((ora*60)+14);
			elteltSzazalek = ((double)eredmeny/(double)szokEv)*100;
			System.out.println("Az év "+formatter.format(elteltSzazalek)+"%-a már eltelt.");
		}
		
		if(ev%4>0){
			for (int i = 0; i < ho-1; i++) {
				eredmeny+=simaEv[i];
			}
			eredmeny = ((eredmeny*24)*60)+((nap*24)*60)+((ora*60)+14);
			elteltSzazalek = ((double)eredmeny/(double)rendEv)*100;
			System.out.println("Az év "+formatter.format(elteltSzazalek)+"%-a már eltelt.");
		}
				
	}

}
