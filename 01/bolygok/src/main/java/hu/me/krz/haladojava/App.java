package hu.me.krz.haladojava;

public class App {
	public static void main(String[] args) {
		Astronomer astronomer = new Astronomer("Galieo");
		astronomer.observeTheSky(astronomer);
	}
}
