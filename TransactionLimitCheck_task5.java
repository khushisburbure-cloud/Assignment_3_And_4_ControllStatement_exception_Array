package customexception_handling;

public class TransactionLimitCheck_task5 {

	public static void main(String[] args) {
		//step 2 :try catch block to handle exception
		//logic to handle exception ; block transaction if limit exceeded
		int withdrawallimit=50000;
		int balance=100000;
		int amount=10000000;//will show exception
		int minbalance=1000;
try {
	if(amount>withdrawallimit) {
		throw new TransactionLimitExceededException("your account is blocked");
	}
	//either
	//if amount is in limit show message
	System.out.print("Transaction within limit : Transaction Success");
	
}
catch(TransactionLimitExceededException or) {
	or.printStackTrace();
}
	}

}

//step1 create exception class TransationLimmitExceededException
class TransactionLimitExceededException extends RuntimeException{
	public TransactionLimitExceededException(String msg) {
		super(msg);
	}
}