package hu.me.krz.haladojava;

import java.util.Arrays;

import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {

		System.out.println("szám:");
		Scanner sc = new Scanner(System.in);
		int next = sc.nextInt();
		if (0 < next && next < 10) {
			Diak[] tomb = new Diak[next];
			for (int i = 0; i < next; i++) {
				Diak diak = new Diak("diak0" + (i + 1), ((int) (Math.random() * 8) + 18), (int) (Math.random() * 6));
				tomb[i] = diak;

			}
			Arrays.sort(tomb);
			for (int i = 0; i < next; i++) {
				System.out.println(tomb[i]);
			}
		} else
			System.exit(0);
	}
}
