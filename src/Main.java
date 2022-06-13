
public class Main {

	public static void main(String[] args) {
		Macchina auto1 = new Macchina("Wolkswagen Polo", 1400, "CC 666 BB", 12378.00, "grigio", 5, true, 2);
		Macchina auto2 = new Macchina("Alfa Romeo Mito", 1200, " XX 777 MM", 15987.00, "nera", 6, false, 0);
		Macchina auto3 = new Macchina("Suzuki Swift", 1300, "XX 444 YY", 10200, "blu", 5, true, 2);
		Macchina auto4 = new Macchina("Renault Clio", 1400, "SS 999 LL", 30876.00, "gialla", 6, true, 2);
		Macchina auto5 = new Macchina("Toyota Yaris", 1100, "PP 333 NN", 5698.00, "rossa", 5, false, 0);

		Macchina[] auto = { auto1, auto2, auto3, auto4, auto5 };

		System.out.println("--------------------------");
		System.out.println("ricerca macchina per targa:");
		infoMacchina(auto, "SS 999 LL");
		System.out.println("--------------------------");
		System.out.println("ricerca macchina per colore:");
		infoMacchinaColore(auto, "blu");

		System.out.println("--------------------------");
		infoMacchinaPiuCostosa(auto);

		System.out.println("--------------------------");
		System.out.println(auto3.stampaInformazioni());
		System.out.println("--------------------------");
		System.out.println(auto3.aumentaMarcia());
		System.out.println("--------------------------");
		System.out.println("il motore di auto2 e' acceso? " + auto2.accendiMotore());
		System.out.println("--------------------------");
		System.out.println("Il motore di auto1 e' acceso? " + auto1.spegniMotore());
		System.out.println("--------------------------");
		System.out.println("la marcia di auto 1 dopo essere stata spenta e': " + auto1.getMarcia());
		System.out.println("--------------------------");
		System.out.println("Cambiamo la marcia di auto2 da 0 a 4 --> " + auto2.cambiaMarcia(4));
		System.out.println("--------------------------");
		System.out.println("La marcia di auto2 dopo aver scalato e': " + auto2.scalaMarcia());
		System.out.println("--------------------------");
		System.out.println("Il costo di auto5 e': " + auto5.getValore());

	}

	// ricerca auto per targa

	static void infoMacchina(Macchina[] auto, String targa) {
		String allert = "";
		for (int i = 0; i < auto.length; i++) {
			if (auto[i].getTarga().equals(targa)) {
				System.out.println(auto[i].stampaInformazioni());
			}
		}

	}
	
	// ricerca auto per colore 

	static void infoMacchinaColore(Macchina[] auto, String colore) {
		for (int i = 0; i < auto.length; i++) {
			if (auto[i].getColore().equals(colore)) {
				System.out.println(auto[i].stampaInformazioni());

			}
		}

	}

	//Ricerca e stampa del nome della macchina piu' costosa
	
	static void infoMacchinaPiuCostosa(Macchina[] auto) {
		int autoCostosa = 0;
		for (int i = 0; i < auto.length; i++) {
			if (autoCostosa < auto[i].getPrezzo()) {
				autoCostosa = i;
			}

		}
		System.out.println("la macchina piu' costosa e': " + auto[autoCostosa].getNome());
	}

}
