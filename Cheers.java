// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
         // inpot name as and times of cheers  
	    String s = args[0];
        int times = Integer.parseInt(args[1]);
        int cheer = 0;

            int x = 0;
            int y = s.length() -1;
            String an = "AEFHILMNORSXaefhilmnorsx";

            while( x <= y){ 
            char c = s.charAt(x);

              if (an.indexOf(c) == -1){
                System.out.println("Give me" + " a  " + s.charAt(x) + ": " + s.charAt(x) + "!" );
              }else{
                 System.out.println("Give me" + " an " + s.charAt(x) + ": " + s.charAt(x) + "!" );}
               
                x++;
                }
                System.out.println("What does that spell?");

                while (cheer < times) {
                    System.out.println(s + "!!!");
                    cheer++;
                }
                    
                }

            }
        

