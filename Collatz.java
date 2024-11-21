// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String theLetter = args[1];
		int next = seed;
		int count = 0;
		String v = "v";
		// check if user entered v or c all the code is nested insaide this condition
		if (theLetter.equals(v)) {
			//check if seed 1 and prints a string representing the sequence to overcome difficulties 
			if (seed == 1){ 
				System.out.println(seed +" "+ (seed *3 +1) +" "+ (seed +1) +" " + seed + "(4)" );
				 
			}
			else{
	
				System.out.println("1 4 2 1 (4)");
				// main loop for the sequence from 2 up to inpot seed
				
				for(int i = 2 ; i <= seed; i++) {
					next = i;
					count =1;
	        // nested loop to calc the sequence
			while (next != 1) {
				
			    //condition to check if numbre is odd or even for doing the right operation for sequence
				if (next % 2 == 0) {
					System.out.print(next + " ");
					next = next / 2;
					count++;
	
				}else{
					System.out.print(next + " ");
					next = next * 3 + 1;
					count++;
	
	
				}
			}	
	        // prints the sequence with the count
			System.out.println(next + " (" + count + ")" );
			}		
			}
		}
		else{
			System.out.println("Every one pf the first " +seed +" hailstone sequences r");		
		}	
        
			
		}


	}
		
		
	

