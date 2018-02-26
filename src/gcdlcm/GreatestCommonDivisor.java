package gcdlcm;

public class GreatestCommonDivisor {
	public int gcd(int a, int b) {
		// a and b both larger than 0
		if (b == 0) {
			return a;
		} else {
			if (a % b == 0) {
				return b;
			} else {
				return gcd(b, a % b);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new GreatestCommonDivisor().gcd(8, 6));
	}
}
