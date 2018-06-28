package feladatok;
//23.	Írj egy függvényt, mely két sztringet kap paraméterként és visszaadja hány karakterük egyezik meg! (például: „alma” és „álmatlan” -> 2 ; „sátortábor” és „bátorság” -> 5 ; „ágy”,„vágy” ->0
public class feladat_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String egy = "alma";
		String ketto = "álmatlan";
		int szamlalo = 0;
		int elem = 0;
		
		char[] elso = egy.toCharArray();
		char[] masodik = ketto.toCharArray();
		
		for (int i = 0; i < masodik.length; i++) {
			if(elso[elem]==masodik[i]) {
				szamlalo++;
				for (int j = i+1; j < masodik.length; j++) {
					
				}
			}else
		}

		System.out.println(szamlalo);
		
		
	}

}
