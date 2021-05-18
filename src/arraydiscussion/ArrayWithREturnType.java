package arraydiscussion;

public class ArrayWithREturnType {

	public static int[] m1(int[] i) {
		return i;
	}

	public static void m2(int[] i) {
		for (int j : i) {
			System.out.println(j);
			System.out.println(" ");

		}
	}

	public static void main(String[] args) {
		int c[]= {10,11,20,36,50};
		int d[]=m1(c);
		m2(d);
	}
}
