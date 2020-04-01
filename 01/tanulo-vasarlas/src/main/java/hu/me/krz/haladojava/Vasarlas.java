package hu.me.krz.haladojava;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Vasarlas {

	public static void main(String[] args) {
		SecureRandom secureRandomGenerator;

		Logger logger = LogManager.getLogger(Vasarlas.class);
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
		int tanulok = Tanulo.osszestanulo();
		for (int i = 0; i < 6; i++) {
			int osszespenz = 0;

			for (Tanulo item : tanulo) {
				try {
					secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
				if (item.getPenz() > 0 && !item.consumption((secureRandomGenerator.nextInt(1501) + 1500))) {
					osszespenz += item.getPenz();
				} else if (item.getPenz() == -5000) {
					continue;
				} else {
					Tanulo.setTanulokLower();
					item.setPenz(-5000);
				}
				tanulok = Tanulo.osszestanulo();
			}catch(NoSuchAlgorithmException | NoSuchProviderException e){
				logger.log(Level.DEBUG, e);
			}
		}
			if (tanulok != 0) {
				logger.log(Level.INFO, "Átlag pénz {} ", (osszespenz / tanulok));
			}
			else {
				logger.log(Level.INFO, "mindenkinek elfogyott a pénze");
			}

		}

		logger.log(Level.INFO, "Ennyi tanulónak maradt pénze: {} ",  tanulok);
		String asd = tanulo.toString();
		logger.log(Level.INFO, asd);

	}

}
