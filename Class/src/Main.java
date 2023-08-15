import java.util.Scanner;

public class Main {    //main class

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\n[Celcius to Farenheit converter]");          //project purpose
        System.out.print("Enter Temprature here (°C): ");              //instruction


        int c = scan.nextInt();         //creates int c where user inputs number
        int d = c * 9/5 + 32;          //c goes through a mathematical calculation and get stored into D

        System.out.println(+c+ "°C in farenheit is " +d+ "°F");   //results of calculation displayed



    }

}
