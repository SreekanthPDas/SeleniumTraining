package practiceProblemSolving;

public class palindrome2 {

	public palindrome2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPal(123321);

	}
	
	public static void isPal(int num) {
		
		int t = num;
		int sum =0;
		int r =0;
		
		while(num>0) {
			
			r=num%10;
			sum = sum*10+r;
			num=num/10;
		}
		
		if (t==sum) {
			
			System.out.println("Number is palindrome "+ sum);
		}else {
			System.out.println("Number is NOT palindrome "+ t + "and " + sum);
		}
	}

}
