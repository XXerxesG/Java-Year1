
public class ComputePI {

	public static void main(String[] args) {

		System.out.println(computepi(10));
	}

	public static double computepi(int n) {
		double pi = 0;
		int deno = 2;
		for (int i = 0; i < n; i++) {

			if (deno % 4 == 1) {
				pi += 1.0 / deno;
			} else {
				pi -= 2.0 / deno;
			}
			deno += 2;
		}
		return pi * 4;
	}
}
