package hu.me.krz.haladojava;

import java.util.ArrayList;

public class Vasarlas {

	public static void main(String[] args) {
		ArrayList<Tanulo> tanulo = new ArrayList<>();
		Tanulo tanulo1 = new Tanulo("Jóska");
		Tanulo tanulo2 = new Tanulo("Béla");
		Tanulo tanulo3 = new Tanulo("Pista");
		Tanulo tanulo4 = new Tanulo("Géza");
		Tanulo tanulo5 = new Tanulo("Feri");
		tanulo.add(tanulo1);
		tanulo.add(tanulo2);
		tanulo.add(tanulo3);
		tanulo.add(tanulo4);
		tanulo.add(tanulo5);
		for (int i = 0; i < 6; i++) {
			int osszespenz = 0;
			int tanulok = Tanulo.getTanulok();
			for (Tanulo item : tanulo) {
				if (item.getPenz() > 0 && item.consumption((int) (Math.random() * 1501) + 1500) == false) {
					osszespenz += item.getPenz();
				} else
					item.setTanulokLower();
			}
			if (tanulok != 0)
				System.out.println("Átlag pénz" + osszespenz / tanulok);
			else
				System.out.println("mindenkinek elfogyott a pénze");

		}
		System.out.println("Ennyi tanulónak maradt pénze: " + Tanulo.getTanulok());
		System.out.println(tanulo.toString());

	}

}
