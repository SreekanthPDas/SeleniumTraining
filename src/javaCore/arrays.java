package javaCore;

public class arrays {

	public arrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int xxx[] = new int[3];
		
		int [][] x = new int[][] {
			{0,1,2,2,3,2},
			{4,56,4,3,6,4},
			{3,4,4,5,3,5}
			
		};
		
		x[0][0] = 12;
		x[2][2] = 434;
		x[1][2] = 343;
		System.out.println("Arrayyyy...!!!");
		for(int i =0; i<x.length;i++) {
			for(int j = 0; j<x[0].length;j++) {
				System.out.println(x[i][j]);
			}
		}
		
		for(int i[]:x) {
			for(int j:i) {
				System.out.print(j);
			}
		}
	}

}
