package Day7hw;

public class Circle {
	public static int Circumfarance() {
		int pi= (int) 3.14;
		int rad=20;
		return 2*pi*rad;
	}
	public static void main(String[] args) {
		System.out.println("Circumfarance of circle " +Circumfarance());
	}
}
