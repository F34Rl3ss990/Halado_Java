package hu.me.krz.haladojava;

//import lombok.Getter;
//import lombok.ToString;

import java.util.Objects;

//@ToString(callSuper = true)
public class Diak extends Szemely implements Comparable<Diak> {
	//@Getter
	private int puska;

	public Diak(String nev, int eletkor, int puska) {
		super(nev, eletkor);
		this.puska = puska;
	}

	
	  public int getPuska() { return puska; }
	 
	
	  @Override public String toString() { return "Diak [puska=" + puska + ", név="
	  + getNev() + ", életkor=" + getEletkor() + "]"; }
	 

	@Override
	public int compareTo(Diak o) {
		if (puska == o.getPuska())
			return 0;
		else if (puska > o.getPuska())
			return 1;
		else
			return -1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Diak diak = (Diak) o;
		return puska == diak.puska;
	}

	@Override
	public int hashCode() {
		return Objects.hash(puska);
	}
}
