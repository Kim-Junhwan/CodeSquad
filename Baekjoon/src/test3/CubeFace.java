package test3;

public class CubeFace {
	String[][]face;
	int name;
	
	public CubeFace(String color,int name) {
		face=new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				face[i][j]=color;
			}
		}
		this.name=name;
	}
	
	public void print() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+face[i][j]+" ");
			}
			if(i<3)
			System.out.println();
		}
	}

	public String[][] getFace() {
		return face;
	}

	public void setFace(String[][] face) {
		this.face = face;
	}
	
	
	
}
