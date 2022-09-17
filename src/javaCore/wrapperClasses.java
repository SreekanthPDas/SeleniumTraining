package javaCore;

public class wrapperClasses {

	public wrapperClasses() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "100";
		
		System.out.println("Str s " + s);
		
		System.out.println("Str s " + s +20 );
		
		int i = Integer.parseInt(s);
		
		System.out.println("Str s " + (i+20));
		
		String x = "12.223";
		
		double d = Double.parseDouble(x);
		
		System.out.println("x " + (d+20));
		
		String ss = "100w";
		
		//System.out.println(Integer.parseInt(ss)+100);
		
		System.out.println(String.valueOf(ss));
		

	}

}
