package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SzemelyTest {

	@Test
	void getEletkor() {
		int eletkor= 3;
		Szemely szemely = new Szemely("jóska", eletkor);
		assertThat(szemely.getEletkor(), is(equalTo(eletkor)));
	}
	@Test
	void getNev() {
		String nev = "jóska";
		Szemely szemely = new Szemely(nev, 15);
		assertThat(szemely.getNev(), is(equalTo(nev)));
	}

}
