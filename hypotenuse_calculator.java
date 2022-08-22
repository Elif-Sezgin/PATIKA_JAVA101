import java.util.Scanner;
public class hypotenuse_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Create variables 
		double leg_1;
		double leg_2;
		double hypotenuse;
		double area;
		double perimeter;
		double value;
		double u;
		
		//Define the Scanner class
        Scanner inp = new Scanner(System.in);
        //Get value from user
        System.out.print("Please Enter Dimension of Leg_1 : ");
        leg_1 = inp.nextDouble();
        System.out.print("Please Enter Dimension of Leg_2 : ");
        leg_2 = inp.nextDouble();
        
        value = (Math.pow( leg_1 , 2)) + (Math.pow( leg_2 , 2));
        hypotenuse = (Math.sqrt(value));
        
        System.out.println("hypotenuse : " + hypotenuse);
        perimeter = (leg_1 + leg_2 + hypotenuse);
        System.out.println("perimeter : " + perimeter);
        u = perimeter/2;
        System.out.println("u : " + u);
        area = (Math.sqrt (u * (u-leg_1)*(u-leg_2)*(u-hypotenuse)));
        System.out.println("area : " + area);
        
	}

}
