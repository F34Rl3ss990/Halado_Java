package hu.me.krz.haladojava;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Proba {

	public static void main(String[] args) {
		SecureRandom secureRandomGenerator;
		Logger logger = LogManager.getLogger(Proba.class);
		logger.log(Level.INFO,"Mennyi adatot akarsz felvinni?");
		Scanner sc = new Scanner(System.in);
		int next = sc.nextInt();
		sc.close();
		if (!(next > 0 && next < 10)) {
			System.exit(0);
		}
		Object[] tomb = new Object[next];
			for (int i = 0; i < next; i++) {
				try {
					secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
					int a = secureRandomGenerator.nextInt(2) + 1;
					if (a == 1) {
						Tanar tanar = new Tanar("Józsi" + i, secureRandomGenerator.nextInt(41) + 20,
								secureRandomGenerator.nextInt(5) + 1);
						tomb[i] = tanar;
					} else {

						Diak diak = new Diak("Feri" + i, secureRandomGenerator.nextInt(13) + 18,
								secureRandomGenerator.nextInt(11) + 0);
						tomb[i] = diak;
					}
				} catch (NoSuchAlgorithmException | NoSuchProviderException e) {
					logger.log(Level.DEBUG, e);
				}
			}
			for (Object item : tomb) {
				String message = item.toString();
				logger.log(Level.INFO, message);
				if (item.getClass() == Tanar.class) {
					Tanar tanar = (Tanar) (item);
					if (tanar.joAlanyE()) {
						message = item.toString();
						logger.log(Level.INFO, message);
					}
				} else if (item.getClass() == Diak.class) {
					Diak diak = (Diak) (item);
					if (diak.joAlanyE()) {
						message = item.toString();
						logger.log(Level.INFO, message);
					}
				}
			}
		}

}
