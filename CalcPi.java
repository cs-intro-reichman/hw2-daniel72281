// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
        // took the needed compunents from each arg and set a var for them
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));  
		int addminuts = Integer.parseInt("" + args[1]);

        // took inpot hours and minuts and added the addminuts
		int totalminuts = (hours * 60) + minutes + addminuts;
		int totalhours = totalminuts / 60;

        // calc the new time in hh:mm format
		int newhours = totalhours % 24;
		int newminuts = totalminuts - (totalhours * 60);

        //made a condition to fix any n<10 to apear "0n"
		if(newminuts < 10){
			System.out.println(newhours + ":0" + newminuts);
		}else{
			System.out.println(newhours + ":" + newminuts);
	      }			
		}   

}
