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
            c = Character.toUpperCase(c);

              if (an.indexOf(c) == -1){
                System.out.println("Give me" + " a  " + c + ": " + c + "!" );
              }else{
                 System.out.println("Give me" + " an " + c + ": " + c + "!" );}
               
                x++;
                }
                System.out.println("What does that spell?");

                while (cheer < times) {
                  s = s.toUpperCase();
                    System.out.println(s + "!!!");
                    cheer++;
                }
                    
                }

            }
        

