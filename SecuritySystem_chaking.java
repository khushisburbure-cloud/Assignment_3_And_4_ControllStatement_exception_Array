package customexception_handling;
import java.util.Scanner;
public class SecuritySystem_chaking {

	public static void main(String[] args) {
	 Scanner password = new Scanner(System.in);
	 	
		 int attempt=0; 
		 int  pasword = 1101;
		 System.out.println("Enter Password :");
		 attempt++;
		 int enteredPassword=password.nextInt();
try {
	
	 // take user input
	
	//logic : creating conditon to show exception and count the number of attempt in login
	//throwing exception at 4th attempt
	//if valid login:access granted ; if not : too many attempts=account locked message
	if(enteredPassword != pasword && attempt>3) {

		 
		 
		
		throw new LoginAttemptExceededException("Too many attempts"+"your account is locked");
	}
	else {
		System.out.println("Login Successfully" );
	}
	
}


catch(LoginAttemptExceededException log){
	log.printStackTrace();
	
}
finally {
	System.out.print("Number of attemps :" + attempt);
	
	
}


	}

}
//creating an custom exceptionn class
class LoginAttemptExceededException extends RuntimeException{
	 public LoginAttemptExceededException(String msg){
		super(msg);
	}
}