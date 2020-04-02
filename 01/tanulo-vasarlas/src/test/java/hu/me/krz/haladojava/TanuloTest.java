package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TanuloTest {
	
	@Test
	void consumption() {
		Tanulo tanulo = new Tanulo ("Jóska");
		tanulo.consumption(3000);
		assertThat(tanulo.getPenz(), is(equalTo(7000)));
		tanulo.setTanulokLower();
	}
	@Test
	void consumption2() {
		Tanulo tanulo = new Tanulo ("Jóska");
		assertThat(tanulo.consumption(3000), is(equalTo(false)));
		tanulo.setTanulokLower();
	}
	@Test
	void osszestanulo() {
		Tanulo tanulo = new Tanulo ("Jóska");
		assertThat(Tanulo.osszestanulo(), is(equalTo(1)));
	}
	@Test
	void getPenz() {
		int penz =5000;
		Tanulo tanulo = new Tanulo("Jóska", penz);
		assertThat(tanulo.getPenz(), is(equalTo(penz)));
		
	}
	@Test
	void getPenz2() {
		Tanulo tanulo = new Tanulo("Jóska");
		assertThat(tanulo.getPenz(), is(equalTo(10000)));
		tanulo.setTanulokLower();
	}
	@Test
	void setTanulokLower() {
		Tanulo tanulo = new Tanulo ("Jóska");
		Tanulo tanulo2 = new Tanulo ("Jóska2");
		assertThat(Tanulo.osszestanulo(), is(equalTo(2)));
		tanulo.setTanulokLower();
		assertThat(Tanulo.osszestanulo(),is(equalTo(1)));
		tanulo.setTanulokLower();
	}


}
