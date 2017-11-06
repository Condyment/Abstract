
public class Sfera extends Calcule {
	private Punct a, b;
	private double d;
	private double ar;
	private double vol;

	public Sfera(int x, int y, int z, int x1, int y1, int z1) {
		this.a = new Punct(x, y, z);
		this.b = new Punct(x1, y1, z1);

	}

	public void distance() {
		d = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z);
		d = Math.sqrt(d);
		System.out.println("Distanta dintre doua puncte=" + d);
	}

	public void aria() {

		ar = 4 * Math.PI * Math.pow(d, 2);
		System.out.println("Aria=" + ar);
	}

	public void volum() {

		vol = (4 * Math.PI * Math.pow(d, 3)) / 3;
		System.out.println("Volum=" + vol);
	}

	public void centruldegreutate() {
		System.out.printf("centrul de greutate x=%d y=%d z=%d ", a.x, a.y, a.z);

	}

}
