import java.util.Scanner;
public class evenNumbers {
	public static void main(String[] args) {
      
		Scanner scan = new Scanner(System.in);
		int limit_number;
		limit_number = scan.nextInt();
		System.out.println("Please enter a limit number:");
		int k=-2;
		while (k < (limit_number-1) ) {
			k= k +2 ;
			
			System.out.println(k);
			
		}
		}
}
