package if_else;
import java.util.Scanner;
public class EvenNumberInrange {

	public static void main(String[] args) {
		//step 1:creating scanner class object
		Scanner scan=new Scanner(System.in);
		
		//printing statement 
		System.out.print("enter value :");
		//step 2: creating variable num to get input from the userr
		int num=scan.nextInt();
		
		//step 3: apply logic 
		//handle iteration using for loop
		//starting loop from 1; the value user will input the iteration will go less than or equal to for  the value ; n+1 will add plus one to the next get the sequence of the number with adding 1
		for( int n=1;n<=num;n=n+1) {
			//condition to find even number from the loop
			if(n%2==0) {
				System.out.print(" "+n+"");
			}
			
		}
		
	}

}
