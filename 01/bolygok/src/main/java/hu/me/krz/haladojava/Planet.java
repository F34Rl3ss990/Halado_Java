package hu.me.krz.haladojava;

import java.util.Objects;

public final class Planet {
	private Point position;
	public final double radius;
	public final String name;

	public Planet(Point position, double radius, String name) {
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public Point getPosition() {
		return position;
	}

	public double getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Planet planet = (Planet) o;
		return Double.compare(planet.radius, radius) == 0 &&
				Objects.equals(position, planet.position) &&
				Objects.equals(name, planet.name);
	}
}

