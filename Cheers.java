// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
         // inpot name  and times of cheers  
	      String s = args[0];
        int times = Integer.parseInt(args[1]);

        // set of vars needed for loop
        int cheer = 0;
        int x = 0;
        int y = s.length() -1;

        // string that holds which char demend an before
        String an = "AEFHILMNORSX";

        //loop that runs until end of input
          while( x <= y){ 
          char c = s.charAt(x);

          //command that solve user mistake if he enterd string uncaptaliezed letter 
          c = Character.toUpperCase(c);
             
            // condition inside loop determends if to print an or a
            if (an.indexOf(c) == -1){
            System.out.println("Give me" + " a  " + c + ": " + c + "!" );
             }else{
             System.out.println("Give me" + " an " + c + ": " + c + "!" );}
             x++;
             }

             System.out.println("What does that spell?");
             
             // loop to print times of cheers
             while (cheer < times) {
             s = s.toUpperCase();
             System.out.println(s + "!!!");
             cheer++;
             }                    
           }
          }
        

