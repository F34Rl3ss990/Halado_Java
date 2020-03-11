package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TanarTest {

	@Test
	void joAlanyE() {
		int eletkor = 30;
		int atlag = 4;
		Tanar tanar = new Tanar("jóska", eletkor,atlag);
		assertThat(tanar.joAlanyE(), is(equalTo(true)));
		
	}

}
