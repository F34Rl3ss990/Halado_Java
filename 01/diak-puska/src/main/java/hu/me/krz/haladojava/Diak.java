package hu.me.krz.haladojava;

import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
public class Diak extends Szemely implements Comparable<Diak> {
	@Getter
	private int puska;

	public Diak(String nev, int eletkor, int puska) {
		super(nev, eletkor);
		this.puska = puska;
	}

	/*
	 * public int getPuska() { return puska; }
	 */
	/*
	 * @Override public String toString() { return "Diak [puska=" + puska + ", név="
	 * + getNev() + ", életkor=" + getEletkor() + "]"; }
	 */

	@Override
	public int compareTo(Diak o) {
		if (puska == o.getPuska())
			return 0;
		else if (puska > o.getPuska())
			return 1;
		else
			return -1;
	}
}
