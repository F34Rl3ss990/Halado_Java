package hu.me.krz.haladojava;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter(AccessLevel.PUBLIC)
public class Szemely {

	private String nev;
	private int eletkor;

	public Szemely(String nev, int eletkor) {
		this.nev = nev;
		this.eletkor = eletkor;
	}

	/*
	 * public String getNev() { return nev; }
	 * 
	 * public int getEletkor() { return eletkor; }
	 */

}
