// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

    // created set 0f ints neccery for pi clac.
	int times = Integer.parseInt(args[0]);
	int t = 0;
	int divisor = 3;
	double pi = 1;

	//created a loop for pi clac, the loop already starts from (1-1\3) so the loop runs for the inpot numbre-1 
	while (t < times-1) {
		//created condition to check if +/- to value of pi(odd=+)
		if (t%2 == 0){
			pi = pi - (1.0/divisor);
		}else{
			pi = pi + (1.0/divisor);
		}
		// increace divisor as the loop continues
		divisor = divisor + 2;	
		t++;		
	  }
	    System.out.println("pi according to java: " + Math.PI );
		System.out.println("pi, approximated:     " + pi*4 );
		
	}
}


