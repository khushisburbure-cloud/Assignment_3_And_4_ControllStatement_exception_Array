package array_task;
import java.util.Scanner;
public class FindSecondLargestElement_task5 {

	public static void main(String[] args) {
		//step 1: create a scanner class object
		Scanner scan=new Scanner(System.in);
		
		//step 2: create an array of n number of element of performance of score
		int score[]=new int [6];
		
		//suppose 1st index element to be large and 2nd lage
		int large=score[0];
		
		System.out.print("Enter Performance Score Here :");
		//step 3: iterate the array 
		for(int i=0;i<score.length;i++) {
			score[i]=scan.nextInt();
			
			
			//step 4: condition to find 1st large element in array 
			if(large>score[i]) {
				large=large;
				
				//if first element is larger then choose second index to to larger
				int second=score[1];
				
				//conditoion apply to get second large element
			 if(second>score[i]&&second<=large) {
					second=second;
					System.out.print("2nd largest:"+second);
				}
				if(second<score[i]&&score[i] <=large) {
					second=score[i];
					System.out.print("2nd largest:"+second);
				}
			}
			if(large<score[i]) {
				large=score[i];
				
				//if largest element among element is from score[i] then choose first index element to be second largest
				int second=score[0];
				
				//condition  check if the number largest is from second[i] 
				if(second<=large&&second>score[i]) {
					second=second;
					System.out.print("2nd largest:"+second);
				}
				if(second<score[i]&&score[i]<=large) {
					second=score[i];
					System.out.print("2nd largest:"+second);
				}
			}
			
		}
	//	System.out.print("largest:"+large);
		
		
		//NOT GETING PROPER OUTPUT
		//input is taking only 2input is recieve
		//i/p=1,2
		//o/p=2.
		
			
	}

}
