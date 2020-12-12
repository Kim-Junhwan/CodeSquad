package test3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
	
	Queue<String> que=new LinkedList();
	
	String list;
	String[] str;
	Scanner scanner=new Scanner(System.in);

	/*
	 * F
	 * {(1,bottom),(4,right),(3,head),(5,left)}
	 * U
	 *{(4,left),(2,head),(5,head),(6,head)}
	 * D
	 * {(6,bottom),(5,bottom),(2.bottom),(4,bottom)}
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
		System.out.print("CUBE>>");
		push(scanner.next());
		divide();
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}

	
	
	public void push(String input) {
		
		if(input.equals("F")) {
			list=one.getbottomline();
			list=list+four.getrightline();
			list=list+three.getheadline();
			list=list+five.getleftline();
		}
		else if(input.equals("U")) {
			list=four.getleftline();
			list=list+two.getheadline();
			list=list+five.getheadline();
			list=list+six.getheadline();
		}
		else if(input.equals("D")) {
			list=six.getbottomline();
			list=list+five.getbottomline();
			list=list+two.getbottomline();
			list=list+four.getbottomline();
		}
		else if(input.equals("B")) {
			list=one.getheadline();
			list=list+five.getrightline();
			list=list+two.getbottomline();
			list=list+four.getleftline();
		}
		else if(input.equals("L")) {
			list=one.getleftline();
			list=list+six.getrightline();
			list=list+three.getleftline();
			list=list+two.getleftline();
		}
		else if(input.equals("R")) {
			list=one.getrightline();
			list=list+two.getrightline();
			list=list+three.getrightline();
			list=list+six.getleftline();
		}
	}
	
	public void divide() {
		str=list.split("");
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
	
	public void init(String[][] input,int i) {
		for(int j=0;j<3;j++) {
			System.out.print(" "+input[i][j]+" ");
		}
	}
}
