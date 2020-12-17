package test3;

public class CubeFace {
	String[][]face;
	int name;
	String line;
	
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
	
	public String getrightline() {
		for(int i=0;i<3;i++) {
			if(i==0)
				line=face[2-i][2];
			else
				line=line+face[2-i][2];
		}
		return line;
	}
	
	public String getleftline() {
		for(int i=0;i<3;i++) {
			if(i==0)
				line=face[i][0];
			else
				line=line+face[i][0];
		}
		return line;
	}
	public String getheadline() {
		for(int i=0;i<3;i++) {
			if(i==0)
				line=face[0][2-i];
			else
				line=line+face[0][2-i];
		}
		return line;
	}
	public String getbottomline() {
		for(int i=0;i<3;i++) {
			if(i==0)
				line=face[2][i];
			else
				line=line+face[2][i];
		}
		return line;
	}
}
