package if_else;

public class ATMwithdrawalSimulation_task7 {

	public static void main(String[] args) {
		//creating variables to access the accountbalance and withdrawal amount 
		int accountbalance=5000;
		int withdrawal=1200;
		
		//applying if-else if-else loop   
		if(accountbalance>=withdrawal && withdrawal==withdrawal*100) {
			System.out.print("WITHDRAWAL SUCCESSFUL");
		}
		else if(withdrawal> accountbalance) {
			System.out.print("INSUFFICIENT BALANCE");
		}
		else {
			System.out.print("INVALID AMOUNT");
		}
	}

}
