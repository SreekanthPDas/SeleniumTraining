package practiceProblemSolving;

public class amstrongNum {

	public amstrongNum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrong(15);

	}

	public static void isArmstrong(int num) {
		
		int temp, r, sum, cube;
		sum =0;
		temp=num;
		
		while(num>0) {
			
			r=num%10;
			sum = sum + r*r*r;
			num=num/10;
		}
		
		if (temp==sum) {
			
			System.out.println("Number is Amstrong "+ sum);
		}else {
			System.out.println("Number is NOT Amstrong "+ temp + " and " + sum);
		}
		
	}
}
