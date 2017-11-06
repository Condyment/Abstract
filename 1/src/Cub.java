
public class Cub extends Calcule {
	private Punct a, b, c, d, e, f, g, h;
	private double dd;
	private double ar;
	private double vol;

	public Cub(int x, int y, int z, int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3, int x4,
			int y4, int z4, int x5, int y5, int z5, int x6, int y6, int z6, int x7, int y7, int z7) {

		this.a = new Punct(x, y, z);
		this.b = new Punct(x1, y1, z1);
		this.c = new Punct(x2, y2, z2);
		this.d = new Punct(x3, y3, z3);
		this.e = new Punct(x4, y4, z4);
		this.f = new Punct(x5, y5, z5);
		this.g = new Punct(x6, y6, z6);
		this.h = new Punct(x7, y7, z7);

	}

	public void distance() {
		dd = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z);
		dd = Math.sqrt(dd);
		System.out.println("Distanta dintre doua puncte=" + dd);

	}

	public void aria() {
		ar = dd * dd * 6;
		System.out.println("Aria=" + ar);
	}

	public void volum() {
		vol = Math.pow(dd, 3);
		System.out.println("Volum=" + vol);

	}

	public void centruldegreutate() {
		double p, o, l;
		p = h.x;
		o = h.y;
		l = h.z;
		System.out.printf("Centrul de greutate x=%f y=%f z=%f", p / 2, o / 2, l / 2);

	}
}
