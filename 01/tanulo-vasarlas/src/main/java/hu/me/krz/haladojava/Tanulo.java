package hu.me.krz.haladojava;

import lombok.Getter;
import lombok.ToString;

//@ToString
public class Tanulo {
	protected final String nev;
	//@Getter
	protected int penz;
	//@Getter
	protected static int tanulok = 0;

	public Tanulo(String nev, int penz) {
		this.nev = nev;
		this.penz = penz;
	}
	
	public static int osszestanulo() { return tanulok; }
	 
	
	public int getPenz() { return this.penz; }
	 
	public Tanulo(String nev) {
		this.nev = nev;
		this.penz = 10000;
		Tanulo.tanulok++;
	}

	public static void setTanulokLower() {
		Tanulo.tanulok--;
	}

	
	  @Override public String toString() { return "Tanulo [nev=" + nev + ", " +
	  penz + "]"; }
	 
	public boolean consumption(int penz) {
		this.penz -= penz;
		if (this.penz == 0 || this.penz < 0)
			return true;
		return false;
	}

}
