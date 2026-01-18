package customexception_handling;

public class Task2_JobPortal {

	public static void main(String[] args) {
		
		int age = 38;
		
		try {
			//logic for showing exception
			//creating method to add range
			if(age<21 || age >35) {
			
			throw new InvalidAgeException("Invalid age Entered ");
		}
System.out.print("Your registretion is done SUCCESSFFULLY ");
		}
		//catch block
				catch(InvalidAgeException a) {
					a.printStackTrace();

	}

	}
}
//creating a user define class for Exceptionn handling 
class InvalidAgeException extends RuntimeException{
	public InvalidAgeException (String reply) {
		super(reply);
	}
}