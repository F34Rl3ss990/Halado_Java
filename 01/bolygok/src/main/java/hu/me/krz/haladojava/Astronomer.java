package hu.me.krz.haladojava;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.security.SecureRandom;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.List;
import java.util.Objects;

public class Astronomer {
	private SecureRandom secureRandomGenerator;


	private static final Logger logger = LogManager.getLogger(Astronomer.class);
	private String name;
	List<Planet> planet = new ArrayList<>();

	public Astronomer(String name) {
		this.name = name;
	}

	public List<Planet> getDiscoveredPlanets() {
		return planet;
	}

	public void observeTheSky(Astronomer astronomer) {
		Point act = new Point(0, 0, 0);
		for (int i = 1; i < 11; i++) {
			act = act.translate(new Point(10, 0, 0));
			try {
				secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
				Planet bolygo = new Planet(act, secureRandomGenerator.nextDouble(), astronomer.name);
				planet.add(bolygo);
			} catch (NoSuchAlgorithmException  | NoSuchProviderException e) {
				logger.log(Level.DEBUG, e);
			}

		}
		toString();
	}

	public String toString() {
		String planetName = "";
		Point pos;
		double rad = 0;

		for (Planet item : planet) {
			planetName = item.getName();
			pos = new Point ( item.getPosition().getX(), item.getPosition().getY(),item.getPosition().getZ());
			rad = item.getRadius();
			String message = ("Astronomer [name=" + name + ", planetName=" + planetName + ", positionX=" + pos.getX()
					+ ", positionY=" + pos.getY() + ", positionZ=" + pos.getZ() + ", radius=" + rad + "]");
			logger.log(Level.DEBUG, message);

		}
		return "";
	}
	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Astronomer that = (Astronomer) o;
		return Objects.equals(name, that.name) &&
				Objects.equals(planet, that.planet);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, planet);
	}
}