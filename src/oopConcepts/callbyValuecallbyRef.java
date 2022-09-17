package oopConcepts;

public class callbyValuecallbyRef {
	int a ;
	int b;
	public callbyValuecallbyRef() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyValuecallbyRef obj = new callbyValuecallbyRef();
		obj.a = 100;
		obj.b = 200;
		System.out.println("Before...");
		System.out.println("a " +obj.a);
		System.out.println("b " +obj.b);
		obj.callbyValuecallbyRefMethod(obj);
		
		System.out.println("After...");
		System.out.println("a " +obj.a);
		System.out.println("b " +obj.b);

	}
	
	void callbyValuecallbyRefMethod(callbyValuecallbyRef ref) {
		ref.a = ref.a +100;
		ref.b = ref.a+ref.b+500;
	}

}
