package feladatok;

import java.text.DecimalFormat;
import java.text.NumberFormat;

//7.	Írj egy függvényt, mely paraméterként megkapja két pont (X,Y) koordinátáit és visszaadja a két pont távolságát! Derékszögû koordinátarendszerben.
public class feladat_17 {

	public static void main(String[] args) {
		ketPontTavolsaga(5,7,8,10);
	}

	private static void ketPontTavolsaga(int x1, int y1, int x2, int y2) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		double d = 0;
		d = Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
		System.out.println(formatter.format(d));		
	}

}
