package customexception_handling;
import java.util.Scanner;
public class MarkValidation_Ofstudent {

	

	public static void main(String[] args) {
		//creating object  of scanner class
		
		int Marks = 40;
		try {
			//logic to validate marks
			if(Marks < 0 && Marks>100) {
				throw new InvalidMarksExxeption("range is not valid");
			}
			
		}
		
		
		catch(InvalidMarksExxeption stu) {
			stu.printStackTrace();
		}

		
	}

}
//creating custom class exception
class InvalidMarksExxeption extends RuntimeException{
	public InvalidMarksExxeption(String msg) {
		super(msg);
	}
}
