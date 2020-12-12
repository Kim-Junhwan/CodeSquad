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
	 * f
	 * {(1,bottom),(4,right),(3.head),(5,left)}
	 * 
	 * 
	 */
	
	
	/*
	 * 		1
	 * 	   4256
	 * 		3
	 */
	
	public Cube(){
		print();
	}

	public void print() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+faceempty[i][j]+" ");
			}
			for(int j=0;j<3;j++) {
				System.out.print(" "+faceone[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+facefour[i][j]+" ");
			}
			for(int j=0;j<3;j++) {
				System.out.print(" "+facetwo[i][j]+" ");
			}
			for(int j=0;j<3;j++) {
				System.out.print(" "+facefive[i][j]+" ");
			}
			for(int j=0;j<3;j++) {
				System.out.print(" "+facesix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+faceempty[i][j]+" ");
			}
			for(int j=0;j<3;j++) {
				System.out.print(" "+facethree[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
