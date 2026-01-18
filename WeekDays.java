package if_else;
import java.util.Scanner;
public class WeekDays {

	public static void main(String[] args) {
		//scanner class object
		Scanner scan=new Scanner(System.in);
		
		//user input
		System.out.print("enter day :");
		//int day=scan.nextInt();
		
	int day=6;
		//swich case implimentation
		switch(day){
		case 1:
			
			System.out.print("WORKING DAY");
			break;
		case 2:
			System.out.print("WORKING DAY");
		break;
		case 3:
			System.out.print("WORKING DAY");
			break;
		case 4:
				System.out.print("WORKING DAY");
				break;		
		case 5:
				System.out.print("WORKING DAY");
				break;
		case 6:
				System.out.print("WEEKEND");
				break;
		case 7:
			System.out.print("WEEKEND");
			break;
		
		//default
			default:
				System.out.print("invalid day enter");
				break;
				
			
		
		}
//output=WEEKEND
	}

}
