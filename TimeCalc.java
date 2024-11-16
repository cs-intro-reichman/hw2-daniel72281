public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));  
		int addminuts = Integer.parseInt("" + args[1]);

        // took inpot hours and minuts and added the addminuts
		int totalminuts = (hours * 60) + minutes + addminuts;
		int totalhours = totalminuts / 60;

        // calc the new time in hh:mm format
		int newhours = totalhours % 24;
		int newminuts = totalminuts - (totalhours * 60);

        //made conditions to fix any hh/mm<10 to apear "0x"
		if (newminuts < 10  && newhours > 10) {		
		    System.out.println(newhours + ":0" + newminuts);}

		if (newminuts < 10  && newhours < 10){
			System.out.println("0" + newhours + ":0" + newminuts);}

		if (newminuts > 10  && newhours < 10) {
			System.out.println("0" + newhours + ":" + newminuts); }

		if (newminuts > 10  && newhours > 10) {
 		 System.out.println(newhours + ":" + newminuts); }
		
	
    }
}
