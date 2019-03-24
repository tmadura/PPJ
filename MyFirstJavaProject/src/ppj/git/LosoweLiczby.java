package ppj.git;
import java.util.Random;

public class LosoweLiczby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int sumaLiczb = 0;
			int suma0 = 0;
			int suma1 = 0;
			int suma2 = 0;
			int suma3 = 0;
			int suma4 = 0;
			int suma5 = 0;
			int suma6 = 0;
			int suma7 = 0; 
			int suma8 = 0;
			int suma9 = 0;

			int[] tablicaLosowa = new int[100];
			Random randomGen = new Random();
			for (int i = 0; i < 100; i++) {
				tablicaLosowa[i] = randomGen.nextInt(10);
				if (tablicaLosowa[i] == 0) {
					suma0++;
				}
				if (tablicaLosowa[i] == 1) {
					suma1++;
				}
				if (tablicaLosowa[i] == 2) {
					suma2++;
				}
				if (tablicaLosowa[i] == 3) {
					suma3++;
				}
				if (tablicaLosowa[i] == 4) {
					suma4++;
				}
				if (tablicaLosowa[i] == 5) {
					suma5++;
				}
				if (tablicaLosowa[i] == 6) {
					suma6++;
				}
				if (tablicaLosowa[i] == 7) {
					suma7++;
				}
				if (tablicaLosowa[i] == 8) {
					suma8++;
				}
				if (tablicaLosowa[i] == 9) {
					suma9++;
				}
				sumaLiczb = sumaLiczb + tablicaLosowa[i];
				System.out.print(tablicaLosowa[i] + " ");
			}
			System.out.println();
			System.out.println("--");
			BubbleSorty ob = new BubbleSorty();
			ob.bubbleSorty(tablicaLosowa);
			System.out.println("Najmniejsza wartoœæ to " + tablicaLosowa[99]);
			System.out.println("Najwiêksza wartoœæ to " + tablicaLosowa[0]);
			System.out.println("Suma wszystkich = " + sumaLiczb);
			System.out.println("Zer-" + suma0 + " Jedynek-" + suma1 + " Dwójek-" + suma2 + " Trójek-" + suma3 + " Czwórek-"
					+ suma4 + " Pi¹tek-" + suma5 + " Szóstek-" + suma6 + " Siódemek-" + suma7 + " Ósemek-" + suma8
					+ " Dziewi¹tek-" + suma9);
			System.out.println("Posortowane b¹belkowo: ");
			for (int i = 0; i < 100; i++) {

				System.out.print(tablicaLosowa[i] + " ");
			}

		}
	

	}


