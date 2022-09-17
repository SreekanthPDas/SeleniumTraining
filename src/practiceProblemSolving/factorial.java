package practiceProblemSolving;

public class factorial {

	public factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		facto(6);

	}
	
	public static void facto(int num) {
		int fact =num;
		int na = num;
		while(num-1>0) {
			
			fact = fact*(num-1);
			num=num-1;
		}
		
		System.out.println(na + " factorial is  "+ fact );
	}

}
