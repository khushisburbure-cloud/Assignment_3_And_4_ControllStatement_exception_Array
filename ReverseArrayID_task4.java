package array_task;
import java.util.Scanner;
public class ReverseArrayID_task4 {

	public static void main(String[] args) {
		//step 1: create object of the class
		Scanner scan=new Scanner(System.in);
		
		//step 2: create an array
		int id[]=new int[5];
		
		//step 3: taking input and iterate the array
		System.out.print("Enter id's of Product : ");
		for(int i=0;i<id.length; i++) {
			id[i]=scan.nextInt();//storing  and getting the input element of array id
		}
		//to display order element
		/*step 4: printing the array element
				System.out.print("Product id from array id is :");
				for(int i=0;i<id.length;i++) {
					System.out.print(id[i]+" ");
				}*/
		//step 5: logic to reverrsee the product id 
		System.out.print("Product id in reverse order is given :");
		for(int j=id.length-1;j>=0;j--) {
			System.out.print(id[j]+" ");
			
		}
		
		
	}

}
