package oopConcepts;

import javaCore.javaBasic;

public class testAccessModifiers extends javaBasic{

	public testAccessModifiers() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		javaBasic jb = new javaBasic();
		
		System.out.println(jb.dx);
		
		System.out.println(jb.ix);
		
		testAccessModifiers am = new testAccessModifiers();
		
		am.protectedMethod();
		System.out.println("Protected Var accessed :"  +am.protectedInt);

	}
}
