package customexception_handling;

public class Task1_BankingDomain {

	public static void main(String[] args) {
		//variable declaration
		int balance = 3000;
		int withdrawalamount = 5000;
		int minimumbalance = 1000;
		try {
			if(withdrawalamount > (balance - minimumbalance)) {
				throw new MinimumBalanceException("Balance is not sufficient to withdraw");
			}
			//either condition block
			System.out.println("Rupees"+" "+withdrawalamount +" "+"is successfully withdrawl");
			balance = balance-withdrawalamount;
			System.out.print("Available Balance in Account is  = " + balance +" "+"Rupees." );
			
		}
		
		catch(MinimumBalanceException ballance){
			ballance.printStackTrace();
			
		}

	}

}
// creating exception handling class
class MinimumBalanceException extends RuntimeException{
	public MinimumBalanceException(String img) {
		super(img);
	}
}