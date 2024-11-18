// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	int times = Integer.parseInt(args[0]);
	int t = 0;
	
	double divisor1 = 3;
	double divisor2 = 5;
	double pi = 1;
	while (t <= times) {
		pi = pi - 1/divisor1 + 1/divisor2;
		divisor1 = divisor1 + 4;
		divisor2 = divisor2 + 4;	
		t++;		
	  }
	    System.out.println("pi according to java: " + Math.PI );
		System.out.println("pi, aprproximated:    " + pi*4 );
	}
}


