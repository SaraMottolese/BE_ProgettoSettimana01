
public class Macchina {

	private String nome;
	private int cilindrata;
	private String targa;
	private double prezzo;
	private String colore;
	private int numeroMarce;
	private boolean motoreAcceso;
	private Integer marcia;

	/* --------------------- COSTRUTTORE ---------------------------- */
	public Macchina(String nome, int cilindrata, String targa, double prezzo, String colore, int numeroMarce,
			boolean motoreAcceso, int marcia) {
		this.nome = nome;
		this.cilindrata = cilindrata;
		this.targa = targa;
		this.prezzo = prezzo;
		this.colore = colore;
		this.numeroMarce = numeroMarce;
		this.motoreAcceso = motoreAcceso;
		this.marcia = marcia;

	}

	/* --------------------- METODI ---------------------------- */

	// metodo per accendere il motore

	public boolean accendiMotore() {
		return this.motoreAcceso = true;
	}

	// metodo per spegnere il motore

	public boolean spegniMotore() {
		this.marcia = 0;
		return this.motoreAcceso = false;
	}

	// metodo per aumentare la marcia di 1 alla volta

	public String aumentaMarcia() {
		String marciaCambiata = "";
		if (marcia >= 0 && marcia < this.numeroMarce) {
			this.marcia++;
			marciaCambiata = "la marcia di auto3 e': " + this.marcia.toString();
		} else {
			marciaCambiata = "Non puoi andare oltre la marcia: " + this.numeroMarce;
		}
		return marciaCambiata;
	}

	//metodo per scalare la marcia di 1 alla volta	
	
	public int scalaMarcia() {
		if (marcia != 0) {
			this.marcia--;
		}
		return this.marcia;
	}

	//metodo per cambiare la marcia impostando quella data in input
	
	public int cambiaMarcia(int numeroMarcia) {
		this.marcia = numeroMarcia;
		return this.marcia;
	}

	// metodo per stampare le informazioni 
	
	public String stampaInformazioni() {
		String n = "nome della macchina: " + this.nome;
		String c = "cilindrata della macchina: " + this.cilindrata;
		String t = "targa della macchina: " + this.targa;
		String p = "prezzo della macchina: " + this.prezzo;
		String cl = "colore della macchina: " + this.colore;
		String nM = "numeroMarce della macchina: " + this.numeroMarce;
		String mT = "il motore e' acceso? " + this.motoreAcceso;
		String m = "marca attuale della macchina: " + this.marcia;
		return n + "\n" + c + "\n" + t + "\n" + p + "\n" + cl + "\n" + nM + "\n" + mT + "\n" + m;
	}
	
	//metodo per leggere il prezzo di una data auto

	public String getValore() {
		String prezzo = "il prezzo della " + this.nome + " e' di euro: " + this.prezzo;
		return prezzo;
	}

	//metodo per comparare due stringhe
	
	public boolean equals(Object obj) {
		if (obj instanceof Macchina) {
			Macchina m = (Macchina) obj;
			return m.targa.equals(targa);

		}
		return false;

	}

	/* --------------------- GET ---------------------------- */
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cilindrata
	 */
	public int getCilindrata() {
		return cilindrata;
	}

	/**
	 * @return the targa
	 */
	public String getTarga() {
		return targa;
	}

	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}

	/**
	 * @return the colore
	 */
	public String getColore() {
		return colore;
	}

	/**
	 * @return the numeroMarce
	 */
	public int getNumeroMarce() {
		return numeroMarce;
	}

	/**
	 * @return the motoreAcceso
	 */
	public boolean isMotoreAcceso() {
		return motoreAcceso;
	}

	/**
	 * @return the marcia
	 */
	public int getMarcia() {
		return marcia;
	}

	/* --------------------- SET ---------------------------- */
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param cilindrata the cilindrata to set
	 */
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	/**
	 * @param targa the targa to set
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}

	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	/**
	 * @param colore the colore to set
	 */
	public void setColore(String colore) {
		this.colore = colore;
	}

	/**
	 * @param numeroMarce the numeroMarce to set
	 */
	public void setNumeroMarce(int numeroMarce) {
		this.numeroMarce = numeroMarce;
	}

	/**
	 * @param motoreAcceso the motoreAcceso to set
	 */
	public void setMotoreAcceso(boolean motoreAcceso) {
		this.motoreAcceso = motoreAcceso;
	}

	/**
	 * @param marcia the marcia to set
	 */
	public void setMarcia(int marcia) {
		this.marcia = marcia;
	}

}
