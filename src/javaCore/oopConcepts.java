package javaCore;

public class oopConcepts {
	
	int empNo;
	String empname;
	int age;
	
/*
	public oopConcepts() {
		// TODO Auto-generated constructor stub
	}*/

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		
		oopConcepts oo = new oopConcepts();
		
		System.out.println("empNo :" + oo.empNo);
		
		System.out.println("empname :" + oo.empname);
		
		
		oo.display();
		
		System.out.println("empNo :" + oo.empNo);
		
		System.out.println("empname :" + oo.empname);
		int x=90;
		int y = 4;
		int d = x/y;
		
		System.out.println("D = "+d);
		
		System.exit(23);
		
		return 1;
	}
	
	void  display() {
		empNo = 979;
		empname = "Sree";
		System.out.println("Emp No :" + empNo);
		System.out.println("Empname :" + empname);
		
	}

}
