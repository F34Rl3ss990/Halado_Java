package hu.me.krz.haladojava;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Arrays;


import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(Proba.class);


		 SecureRandom secureRandomGenerator;

		logger.log(Level.INFO, "Adj meg egy számot:");


		Scanner sc = new Scanner(System.in);
		int next = sc.nextInt();

		sc.close();
		if (0 < next && next < 10) {
			Diak[] tomb = new Diak[next];
			for (int i = 0; i < next; i++) {
				try {
					secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
					Diak diak = new Diak("diak0" + (i + 1), (secureRandomGenerator.nextInt(7)+ 18 ), secureRandomGenerator.nextInt(5));
					tomb[i] = diak;
				} catch (NoSuchAlgorithmException | NoSuchProviderException e) {
					logger.log(Level.DEBUG, e);
				}


			}
			Arrays.sort(tomb);
			for (int i = 0; i < next; i++) {
				logger.log(Level.INFO, tomb[i]);

			}
		} else {
			System.exit(0);
		}
	}
}
