package practiceProblemSolving;

public class primeNumbers {

	public primeNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int number, iter;
		
		System.out.println("Is 2 Prime ? " + isPrime(2));
		System.out.println("Is 217 Prime ? " + isPrime(217));
		iter=2;
		int count = 0, num;
		num= 200;
		while(iter<=num) {
			
			if(isPrime(iter)) {
				System.out.print(iter + " ");
				count ++;
				
			}
			iter ++;
			
		}
				
		System.out.println("NUmber of Prime Numbers from 1 to " + num + " is " + count);
	}
	
	public static boolean isPrime(int number) {
		
		int remain, iter;
		boolean div ;
		div = true;
		if(number <2) {
			return false;
		}
		for (iter=2;iter <= number/2; iter++) {
			
			remain = number %iter;
			if (remain ==0){
				div = false;		
				break;
			}
		}
		
		return div;
		
		

		
	}

}
