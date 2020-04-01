package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato {

	private int puskaszam;

	public Diak(String nev, int eletkor, int puskaszam) {
		super(nev, eletkor);
		this.puskaszam = puskaszam;
	}

	@Override
	public boolean joAlanyE() {
		return puskaszam==0;
	}

	@Override
	public String toString() {
		return "Diak [puskaszam=" + puskaszam + ", getNev()=" + getNev() + ", getEletkor()=" + getEletkor() + "]";
	}

}
