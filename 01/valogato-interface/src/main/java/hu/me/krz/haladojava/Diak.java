package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato {

	private int puskaszam;

	public Diak(String nev, int eletkor, int puskaszam) {
		super(nev, eletkor);
		this.puskaszam = puskaszam;
	}

	@Override
	public boolean joAlanyE() {
		if (puskaszam == 0)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Diak [puskaszam=" + puskaszam + ", getNev()=" + getNev() + ", getEletkor()=" + getEletkor() + "]";
	}

}
