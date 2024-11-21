// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String theLetter = args[1];
		int next = seed;
		int count = 0;
		
		// compering inpot to v or else(c) to print string as needed all the code is nested inside this loop
		String v = "v";
		if (theLetter.equals(v)) {
			// to overcome difficulty with seed value 1 created a condition that prints string as calc,
			//else valeu will go inside main loop

			if (seed == 1){ 
				System.out.println(seed +" "+ (seed *3 +1) +" "+ (seed +1) +" " + seed + " (4)" );
				System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");		
				 
			}
			else{
	
				System.out.println("1 4 2 1 (4)");
				// main loop start from 2 and goes up to inpot seed while counting steps
				
				for(int i = 2 ; i <= seed; i++) {
					next = i;
					count =1;
				//nested while loop insade the main for loop to calc the sequence as needed, divided to odd or even calc
	
			    while (next != 1) {
				
			
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
	        // prints the sequence
			System.out.println(next + " (" + count + ")" );
			
			}
					
			System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");		
			}
		}
		else{
			System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");		
		}	
        
			
		}


	}
		
		
	

