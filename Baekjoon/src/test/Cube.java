package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Cube {
	CubeObject obj=new CubeObject();
	
	 Deque<String> dq;
	Scanner scanner=new Scanner(System.in);
	String[] list;
	String input;
	
	public Cube() {
		String[][] threecube=obj.getThreecube();
		print(threecube);
		while(true) {
			System.out.print("CUBE >");
			list=scanner.next().split("");
			move(threecube);
		}
	}
	
	public void move(String[][] threecube) {
		for(int i=0;i<list.length;i++) {
			dq=new ArrayDeque<String>();
			if(list[i].equals("U")) {
				dq=inputdeque(threecube,"width",0,0);
				dq=directL(dq);
				inputcube(threecube,dq,"width",0,0);
			}
			else if(list[i].equals("U\'")) {
				dq=inputdeque(threecube,"width",0,0);
				dq=directR(dq);
				inputcube(threecube,dq,"width",0,0);
			}
			else if(list[i].equals("R")) {
				dq=inputdeque(threecube,"high",0,2);
				dq=directL(dq);
				inputcube(threecube,dq,"high",0,2);
			}
			else if(list[i].equals("R\'")) {
				dq=inputdeque(threecube,"high",0,2);
				dq=directR(dq);
				inputcube(threecube,dq,"high",0,2);
			}
			else if(list[i].equals("L")) {
				dq=inputdeque(threecube,"high",0,0);
				dq=directR(dq);
				inputcube(threecube,dq,"high",0,0);
			}
			else if(list[i].equals("L'")) {
				dq=inputdeque(threecube,"high",0,0);
				dq=directL(dq);
				inputcube(threecube,dq,"high",0,0);
			}
			else if(list[i].equals("B")) {
				dq=inputdeque(threecube,"width",2,0);
				dq=directR(dq);
				inputcube(threecube,dq,"width",2,0);
			}
			else if(list[i].equals("B'")) {
				dq=inputdeque(threecube,"width",2,0);
				dq=directL(dq);
				inputcube(threecube,dq,"width",2,0);
			}
			else if(list[i].equals("Q")) {
				System.out.println("Bye~");
				System.exit(0);
			}
			System.out.println(list[i]);
			print(threecube);
		}
	}
	
	Deque directR(Deque dq){	//오른쪽으로 문자열 이동
		for(int i=0;i<1;i++) {
			String word=(String)dq.pollLast();
			dq.addFirst(word);
		}
		return dq;
	}
	
	Deque directL(Deque dq){	//왼쪽으로 문자열 이동
		for(int i=0;i<1;i++) {
			String word=(String)dq.pollFirst();
			dq.addLast(word);
		}
		return dq;
	}
	
	public Deque inputdeque(String[][] threecube,String cross, int row,int column) { //deque에 cube내용 넣기
		if(cross.equals("high")) {
			for(int i=0;i<3;i++) {
				dq.add(threecube[i][column]);
			}
		}
		else if(cross.equals("width")) {
			for(int i=0;i<3;i++) {
				dq.add(threecube[row][i]);
			}
		}
		return dq;
	}
	
	public void inputcube(String[][] threecube,Deque dq,String cross,int row,int column) {	//deque에 의해 이동된 문자열 threecube에 넣기
		if(cross.equals("high")) {
			for(int i=0;i<threecube.length;i++) {
				threecube[i][column]=(String) dq.pollFirst();
			}
		}
		else if(cross.equals("width")) {
			for(int i=0;i<threecube.length;i++) {
				threecube[row][i]=(String) dq.pollFirst();
			}
		}
	}
	
	public void print(String[][] threecube) {
		for (int i=0;i <threecube.length;i++) {
            for (int j=0;j<threecube.length;j++) {
                System.out.print(threecube[i][j]);
            }
            System.out.println();
        }
        System.out.println();
	}

	public static void main(String[] args) {
		new Cube();
	}
}
