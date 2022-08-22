import java.util.Scanner;
public class VAT_VALUE_CALCULATOR {
	public static void main(String[] args) {
        //Create variables
        double price ;
        double taxrate ;
        double vatIncludedPrice ;
      //Define the Scanner class
        Scanner inp = new Scanner(System.in);
      //Get value from user
        System.out.print("Please Enter Vat Excluded Price : ");
        price = inp.nextDouble();
        
        //Condition expression
        taxrate  = (price > 1000) ?  0.08 : 0.18;
        
        vatIncludedPrice = price + price*taxrate ;
     double tax;
     tax = price*taxrate;
     System.out.println("Vat : " +tax);
        System.out.println("Vat Include Price: " +vatIncludedPrice);
}
}