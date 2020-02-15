package hu.me.krz.haladojava;

public class Point {

	private final long x;
	private final long y;
	private final long z;

	public Point(long x, long y, long z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	}

	public Point translate(Point addPoint) {
		long a = x + addPoint.x;
		long b = y + addPoint.y;
		long c = z + addPoint.z;
		return new Point(a, b, c);
	}
}
