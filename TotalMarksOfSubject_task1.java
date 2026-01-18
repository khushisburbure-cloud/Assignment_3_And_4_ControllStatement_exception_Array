package array_task;
import java.util.Scanner;
public class TotalMarksOfSubject_task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//student has appeared for multiple subjects . create array of marks of different subject
		//calculating tatal marks of the subject 
		
		//create an array marks of student  
		int marksOfsubject[]=new int[5];
		//creating local variable total 
		
		System.out.print("Enter the marks of the subject :");
		
		//itteration used to traverse for loop
		int sum=0;
		for(int i=0; i<marksOfsubject.length;i++) {
			 marksOfsubject[i]=scan.nextInt();// integer variable created to get marks from user
			
		//logic
			sum+=marksOfsubject[i];
			
		}
		System.out.print("sum of all subject marks is :"+ sum);
	}

}
