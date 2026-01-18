package if_else;
import java.util.Scanner;
public class OfficeEntryEligibility {

	public static void main(String[] args) {
		//scanner class object create
		Scanner scan=new Scanner(System.in);
		
		float hour=24;
		System.out.print(" Noted Arrival time:");
		//if want user input
		 //int arrival=scan.nextInt();
		  int arrival=9;
		 //logic
		 //total hour =24; allowed time=9hour; total hour-allowed=15 ;
		 if(hour-arrival>=15) {
			 System.out.print(" ENTRY ALLOWED");
		 }
		 else {
			 System.out.print(" LATE ENTRY ");
		 }
//output=entry allow
	}

}
