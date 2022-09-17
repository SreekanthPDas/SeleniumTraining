package practiceProblemSolving;

public class palindrome {

	public palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println(isPal(1233221));
	}
	
	public static boolean isPal (int number){
		int nu = number;
 		String num = String.valueOf(number); 
		int lenNum = num.length();
		int haf = lenNum/2, temp;
		char left,right;
		int a[] ;
		a = new int [lenNum*2];
		int b[] ;
		b = new int [lenNum*2];
		boolean flag = true;
		int i;
		for(i=0;i<=lenNum-1;i++) {
			
			temp = nu%10;
			a[i]=temp;
			nu=nu/10;
		}
		int lNum = lenNum;
		if(lNum%2==0) {
			lenNum= lNum/2;
		}else {
			lenNum= lNum/2+1;
		}
		for(i=0; i<=lenNum ; i++) {
			
			System.out.println("a[" + i +"] =" + a[i] + "  a[" + (lNum-i-1) + "]=" + a[lNum-i-1]);
			
			if(a[i]==a[lNum-i-1]) {
				
				
			}else {
				flag = false;
			}
			
			
		}
		return flag;
	}
}
