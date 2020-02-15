package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato {

	private double atlag;

	public Tanar(String nev, int eletkor, int atlag) {
		super(nev, eletkor);
		this.atlag = atlag;
	}

	@Override
	public boolean joAlanyE() {
		if (getEletkor() < 30 && atlag > 4)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Tanar [atlag=" + atlag + ", getNev()=" + getNev() + ", getEletkor()=" + getEletkor() + "]";
	}
}
