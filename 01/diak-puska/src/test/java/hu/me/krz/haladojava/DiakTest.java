package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiakTest {

	@Test
	void getPuska() {
		int puska= 3;
		Diak diak = new Diak("Jóska", 15, puska);
		assertThat(diak.getPuska(), is(equalTo(3)));
	}
	@Test
	void compare() {
		Diak diak2 = new Diak("Jóska2", 16, 3);
		Diak diak = new Diak("Jóska", 15, 4);
		assertThat(diak.compareTo(diak2), is(equalTo(1)));
	}

}
