import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        bomba POP = new bomba(); //object creation
        POP.EXPLOSION(); //method call from the object class

    }

    public static class boom {
        void EXPLOSION() {    //superclass method
            System.out.println("BOOM");
        }
    }

    public static class bomba extends boom {  //subclass inherited from boom superclass

        void EXPLOSION() {   //subclass method

            int tries = 7;   //initialize tries

            while (true) {

                Scanner CT = new Scanner(System.in);


                System.out.print("ENTER NUMBER HERE: ");
                int a = CT.nextInt();  //get number from user input

                if (tries == 0) {
                    super.EXPLOSION();   //superclass method call if tries runs out
                    break;
                } else {
                    if (a == 10) {
                        System.out.println("\n\nBOMB DEFUSED");    //loop ends when user inputs 10
                        break;
                    } else if (a < 10) {
                        System.out.println("[BEEP] too low\n");
                        --tries;                                    //decrease tries if wrong
                        System.out.println("YOU HAVE " +tries+ " TRIES REMAINING");
                    } else {
                        System.out.println("[BOOP] too high\n");
                        --tries;                                    //decrease tries if wrong
                        System.out.println("YOU HAVE " +tries+ " TRIES REMAINING");
                    }
                }

            }
        }
    }

}