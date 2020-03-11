package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlanetTest {

	@Test
	void getPosition() {
		Point position = new Point(1,2,3);
		Planet planet = new Planet(position, 3, "béla");
		assertThat(planet.getPosition(), is(equalTo(position)));
	}
	@Test
	void getRadius() {
		double radius = 3;
		Point position = new Point(1,2,3);
		Planet planet = new Planet(position, radius, "béla");
		assertThat(planet.getRadius(), is(equalTo(radius)));
	}
	@Test
	void getName() {
		String name = "béla";
		Point position = new Point(1,2,3);
		Planet planet = new Planet(position, 3, name);
		assertThat(planet.getName(), is(equalTo(name)));
		
	}



}
