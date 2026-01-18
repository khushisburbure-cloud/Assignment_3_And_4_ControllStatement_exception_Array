package if_else;
import java.util.Scanner;
public class PassLengthCheck_task4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("ENTER PASSWORD : ");
	//	double length=scan.nextDouble(); if want to check more than 10like:1234567896.. 
		int length=8;//if entered 8 statement will show STRONG PASSWORD.
		//created length variable and pass the value 
		//condition with if length is less than length 8 will show msg weak password
		if( length>=8  ) {
		
				System.out.print("STRONG PASSWORD");
		}
			
		else {
			System.out.print("WEAK PASSWORD");
		
		}
	}

}
