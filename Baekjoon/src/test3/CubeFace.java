package test3;

public class CubeFace {
	String[][]face;
	int name;
	String[] line=new String[3];
	
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
	
	public String[] getrightline() {
		for(int i=0;i<3;i++) {
			line[i]=face[i][2];
		}
		return line;
	}
	
	public String[] getleftline() {
		for(int i=0;i<3;i++) {
			line[i]=face[i][0];
		}
		return line;
	}
	public String[] getheadline() {
		for(int i=0;i<3;i++) {
			line[i]=face[0][i];
		}
		return line;
	}
	public String[] getbottomline() {
		for(int i=0;i<3;i++) {
			line[i]=face[2][i];
		}
		return line;
	}
}
