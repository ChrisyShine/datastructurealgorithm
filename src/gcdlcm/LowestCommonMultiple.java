package gcdlcm;

public class LowestCommonMultiple {
	public int lcm(int a, int b) {
		// a and b must be larger than 0
		return a*b/gcd(a, b);
	}
	
	public int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		System.out.println(new LowestCommonMultiple().lcm(8, 6));
	}
}
