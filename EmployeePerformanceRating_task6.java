package if_else;

public class EmployeePerformanceRating_task6 {

	public static void main(String[] args) {
		int score=68;
		if(score<50) {
			System.out.print("NEED IMPROVEMENT");	
			}
		else if(score>50 && score<75) {
			System.out.print("GOOD");
		}
		else if(score<101) {
			System.out.print("Excellent");
		}
		else {
			System.out.print("WRONG VALUE");
		}

	}

}
