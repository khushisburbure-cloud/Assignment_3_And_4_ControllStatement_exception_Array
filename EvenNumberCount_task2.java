package array_task;
import java.util.Scanner;
public class EvenNumberCount_task2 {

	public static void main(String[] args) {
		//writing a program to count even number of daily sales counts 
		//step 1:creating scannerr class object
		Scanner scan=new Scanner(System.in);
		
		//step 2: creating array of size 6
		int dailysalescount[]=new int[6];
		
		//step 3:counter variable to count even number of element inn daily sale
		int count=0;
		
		System.out.print("Daily sales count are :");
		//step 4: itterateing the array to find positive no. in it by for loop
		for(int i=0; i<dailysalescount.length;i++) {
			//geting input from user and storing the innput to the arrray
			dailysalescount[i]=scan.nextInt();
			//step 5: apply condition 
		if(dailysalescount[i]%2==0) {
			count++;
		}
		}
		//step 6: printing the output to the user
		System.out.print("Even number of daily sales countered is :"+count);
	}

}
