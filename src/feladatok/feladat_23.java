package feladatok;
//23.	�rj egy f�ggv�nyt, mely k�t sztringet kap param�terk�nt �s visszaadja h�ny karakter�k egyezik meg! (p�ld�ul: �alma� �s ��lmatlan� -> 2 ; �s�tort�bor� �s �b�tors�g� -> 5 ; ��gy�,�v�gy� ->0
public class feladat_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String egy = "alma";
		String ketto = "�lmatlan";
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
