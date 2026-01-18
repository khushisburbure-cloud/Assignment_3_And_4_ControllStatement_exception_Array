package array_task;
import java.util.Scanner;
public class FindMaxsalaryOfEmployee_task3 {

	public static void main(String[] args) {
		//writing a programm to find highest salary ammong all salary from array
		//step 1: create scanner class objet 
		Scanner scan=new Scanner(System.in);
		//creating array of salaries
		int salaries[]=new int[4];
		//printing statement
		System.out.print("Enter amount of salary:");
		//step 3: iterating the array to access the element 
		
		//consider first element from the array to be max
		int max=salaries[0];
		
		for(int i=0; i<salaries.length;i++) {
			//step 4: storing the input data from user  into array 
			salaries[i]=scan.nextInt();
			
			//apply condition for geting largest salary from array
			if(max>salaries[i]) {
				max=max;
				
			}
			if(max<salaries[i]) {
				max=salaries[i];
			}
			
		}
		System.out.print("Highest Salary Among all Salaries is :"+max);
		
	}

}
