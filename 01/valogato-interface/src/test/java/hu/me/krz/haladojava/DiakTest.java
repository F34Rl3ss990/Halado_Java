package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiakTest {

	@Test
	void joAlanyE() {
		int puska = 0;
		Diak diak = new Diak("jóska", 5,puska);
		assertThat(diak.joAlanyE(), is(equalTo(true)));
		
	}
}
