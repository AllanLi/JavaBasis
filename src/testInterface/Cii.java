package testInterface;

public class Cii implements Ciii {
	protected double area;
	protected double reArea;

	public Cii(double i) {
		reArea = i;
	}
	
	public void show() {
		area = area * 3;
		System.out.println("area=" + area);
	}

	public void computeArea() {
		area = reArea * reArea * pi;
		System.out.println("computeArea(),area= " + area);
	}
}
