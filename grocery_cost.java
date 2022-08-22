import java.util.Scanner;
public class grocery_cost {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Create variables
	double armut = 2.14;
	double elma = 3.67;
	double domates = 1.11;
	double muz = 0.95;
	double patlican = 5.00; 	
	double m_armut, m_elma, m_domates, m_muz, m_patlican;
	//Define the Scanner class
    Scanner inp = new Scanner(System.in);
    //Get value from user
    System.out.print("Kaç kg armut? : ");
    m_armut = inp.nextDouble();
    System.out.print("Kaç kg elma? : ");
    m_elma = inp.nextDouble();
    System.out.print("Kaç kg domates? : ");
    m_domates = inp.nextDouble();
    System.out.print("Kaç kg muz? : ");
    m_muz = inp.nextDouble();
    System.out.print("Kaç kg patlican? : ");
    m_patlican = inp.nextDouble();
    
    
    double total_cost ;
    total_cost = armut*m_armut + elma*m_elma + domates*m_domates + muz*m_muz + patlican*m_patlican ;
    System.out.print("Total cost : " + total_cost);
}
}