package practice002;

public class task09 {

	public static void main(String[] args) {

		int n = getRandom(0, 5);
		int fact = 1;

		System.out.println(n);
		
		if (n==0 || n==1) {
			fact = 1;
		}
		
		for(int i=1; i<=n; i++) {
			fact = fact*i;

		}
		
		System.out.println(fact);

	}
	
	private static int getRandom(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

}
