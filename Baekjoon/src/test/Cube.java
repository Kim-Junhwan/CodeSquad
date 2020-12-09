package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Cube {
	String[][] threecube= {
			{"R","R","W"},
			{"G","C","W"},
			{"G","B","B"}
	};
	 Deque<String> dq;
	Scanner scanner=new Scanner(System.in);
	String[] list;
	String input;
	
	public Cube() {
		print();
		while(true) {
			System.out.print("CUBE >");
			list=scanner.next().split("");
			move();
		}
	}
	
	public void move() {
		for(int i=0;i<list.length;i++) {
			dq=new ArrayDeque<String>();
			if(list[i].equals("U")) {
				dq=inputdeque("width",0,0);
				dq=directL(dq);
				inputcube(dq,"width",0,0);
			}
			else if(list[i].equals("U\'")) {
				dq=inputdeque("width",0,0);
				dq=directR(dq);
				inputcube(dq,"width",0,0);
			}
			else if(list[i].equals("R")) {
				dq=inputdeque("high",0,2);
				dq=directL(dq);
				inputcube(dq,"high",0,2);
			}
			else if(list[i].equals("R\'")) {
				dq=inputdeque("high",0,2);
				dq=directR(dq);
				inputcube(dq,"high",0,2);
			}
			else if(list[i].equals("L")) {
				dq=inputdeque("high",0,0);
				dq=directR(dq);
				inputcube(dq,"high",0,0);
			}
			else if(list[i].equals("L'")) {
				dq=inputdeque("high",0,0);
				dq=directL(dq);
				inputcube(dq,"high",0,0);
			}
			else if(list[i].equals("B")) {
				dq=inputdeque("width",2,0);
				dq=directR(dq);
				inputcube(dq,"width",2,0);
			}
			else if(list[i].equals("B'")) {
				dq=inputdeque("width",2,0);
				dq=directL(dq);
				inputcube(dq,"width",2,0);
			}
			else if(list[i].equals("Q")) {
				System.out.println("Bye~");
				System.exit(0);
			}
			System.out.println(list[i]);
			print();
		}
	}
	
	Deque directR(Deque dq){
		for(int i=0;i<1;i++) {
			String word=(String)dq.pollLast();
			dq.addFirst(word);
		}
		return dq;
	}
	
	Deque directL(Deque dq){
		for(int i=0;i<1;i++) {
			String word=(String)dq.pollFirst();
			dq.addLast(word);
		}
		return dq;
	}
	
	public Deque inputdeque(String cross, int row,int column) {
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
	
	public void inputcube(Deque dq,String cross,int row,int column) {
		if(cross.equals("high")) {
			for(int i=0;i<3;i++) {
				threecube[i][column]=(String) dq.pollFirst();
			}
		}
		else if(cross.equals("width")) {
			for(int i=0;i<3;i++) {
				threecube[row][i]=(String) dq.pollFirst();
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < threecube.length; i++) {
            for (int j = 0; j < threecube.length; j++) {
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
