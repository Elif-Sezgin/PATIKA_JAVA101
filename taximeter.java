import java.util.Scanner;
public class taximeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create variables
        double valuePerKM = 2.2;
        double distance;
        double cost;
      //Define the Scanner class
        Scanner inp = new Scanner(System.in);
        //Get value from user
        System.out.print("Distance (km) : ");
        distance = inp.nextDouble();
        cost = 10 + distance * 2.2;
        
      //Condition expression
        cost  = (cost <= 20) ?  20 : cost;
        
       
        
        System.out.print("Cost : " + cost);
	}

}
