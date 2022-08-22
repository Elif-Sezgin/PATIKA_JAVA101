import java.util.Scanner;
public class GPA_CALCULATOR {
	 public static void main(String[] args) {
	        
		 //Create variables
	        int math, physics, chemical, turkish, history, music;

	        //Define the Scanner class
	        Scanner inp = new Scanner(System.in);

	        //Get values from user
	        System.out.print("Math Grade : ");
	        math = inp.nextInt();

	        System.out.print("Physics Grade : ");
	        physics = inp.nextInt();

	        System.out.print("Chemical Grade : ");
	        chemical = inp.nextInt();

	        System.out.print("Turkish Grade : ");
	        turkish = inp.nextInt();

	        System.out.print("History Grade : ");
	        history = inp.nextInt();

	        System.out.print("Music Grade : ");
	        music = inp.nextInt();

	        int total = (math + physics + chemical + turkish + music + history);
	        double result = total / 6;
	        System.out.println("Average : " + result);

	        //Condition expression
	        String Situation  = (result >= 60) ? "congratulations you PASS!": "Sorry, you fail ";
	        System.out.println("Success status: "+Situation);

	    }
}
