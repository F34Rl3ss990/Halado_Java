package hu.me.krz.haladojava;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void getPositionX() {
		Point position = new Point(1,2,3);
		long a = 1;
		assertThat(position.getX(), is(equalTo(a)));
	}
	@Test
	void getPositionY() {
		Point position = new Point(1,2,3);
		long b = 2;
		assertThat(position.getY(), is(equalTo(b)));
	}
	@Test
	void getPositionZ() {
		Point position = new Point(1,2,3);
		long c = 3;
		assertThat(position.getZ(), is(equalTo(c)));
	}
	/*void translate(Point addPoint) {
		long a=1;
		long b=2;
		long c=3;
		
		Point point = new Point(a,b,c);
	}*/
}
