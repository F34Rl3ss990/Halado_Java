package hu.me.krz.haladojava;

import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {

		System.out.println("Mennyi adatot akarsz felvinni?");
		Scanner sc = new Scanner(System.in);
		int next = sc.nextInt();
		if (next > 0 && next < 10) {
			Object[] tomb = new Object[next];
			for (int i = 0; i < next; i++) {
				int a = ((int) (Math.random() * 2) + 1);
				if (a == 1) {
					Tanar tanar = new Tanar("Józsi" + i, ((int) (Math.random() * 41) + 20),
							((int) (Math.random() * 5) + 1));
					tomb[i] = tanar;
				} else if (a == 2) {
					Diak diak = new Diak("Feri" + i, ((int) (Math.random() * 13) + 18),
							((int) (Math.random() * 11) + 0));
					tomb[i] = diak;
				}
			}
			for (Object item : tomb) {
				System.out.println(item.toString());
				if (item.getClass() == Tanar.class) {
					Tanar tanar = (Tanar) (item);
					if (tanar.joAlanyE()) {
						System.out.println(item.toString());
					}
				} else if (item.getClass() == Diak.class) {
					Diak diak = (Diak) (item);
					if (diak.joAlanyE()) {
						System.out.println(item.toString());
					}
				}
			}
		} else {
			System.exit(0);
		}
	}
}
