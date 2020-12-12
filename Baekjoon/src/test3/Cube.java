package test3;

public class Cube {
	CubeFace one=new CubeFace("B",1);
	String[][] faceone=one.getFace();
	CubeFace two=new CubeFace("O",1);
	String[][] facetwo=two.getFace();
	CubeFace three=new CubeFace("R",1);
	String[][] facethree=three.getFace();
	CubeFace four=new CubeFace("W",1);
	String[][] facefour=four.getFace();
	CubeFace five=new CubeFace("G",1);
	String[][] facefive=five.getFace();
	CubeFace six=new CubeFace("Y",1);
	String[][] facesix=six.getFace();
	CubeFace empty=new CubeFace(" ",0);
	String[][] faceempty=empty.getFace();
	
	/*
	 * F
	 * {(1,bottom),(4,right),(3,head),(5,left)}
	 * U
	 *{(4,left),(2,head),(5,head),(6,head)}
	 * D
	 * {(6,bottom),(5,bottom),(2.bottom),(4,bototm)}
	 * B
	 * {(1,head),(5,right),(2,bottom),(4.left)}
	 * L
	 * {(1,left),(6,right),(3,left),(2,left)}
	 * R
	 * {(1,right),(2,right),(3,right),(6,left)}
	 */
	
	
	/*
	 * 		1
	 * 	   4256
	 * 		3
	 */
	
	public Cube(){
		print();
	}

	public void init(String[][] input,int i) {
		for(int j=0;j<3;j++) {
			System.out.print(" "+input[i][j]+" ");
		}
	}
	
	public void print() {
		for(int i=0;i<3;i++) {
			init(faceempty,i);
			init(faceone,i);
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			init(facefour,i);
			init(facetwo,i);
			init(facefive,i);
			init(facesix,i);
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			init(faceempty,i);
			init(facethree,i);
			System.out.println();
		}
		
	}
}
