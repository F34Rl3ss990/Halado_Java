package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Astronomer {

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
			Planet bolygo = new Planet(act, Math.random(), astronomer.name);
			planet.add(bolygo);
		}
		toString();
	}

	public String toString() {
		String planetName = "";
		Point pos = new Point(0, 0, 0);
		double rad = 0;
		for (Planet item : planet) {
			planetName = item.getName();
			pos = item.getPosition();
			rad = item.getRadius();
			System.out.println("Astronomer [name=" + name + ", planetName=" + planetName + ", positionX=" + pos.getX()
					+ ", positionY=" + pos.getY() + ", positionZ=" + pos.getZ() + ", radius=" + rad + "]");
		}
		return null;
	}
}
