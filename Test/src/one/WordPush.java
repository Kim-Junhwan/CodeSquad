package one;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class WordPush {
	Deque inout(String arr,int move, char direct) {
		String[] list=arr.split("");
		 Deque<String> dq=new ArrayDeque<String>();
		for(int i=0;i<list.length;i++) {
			dq.add(list[i]);
		}
		if(direct=='L'||direct=='l') {
			if(move<0) {
				return directR(dq,-1*move);
			}
			else
				return directL(dq,move);
		}
		else if(direct=='R'||direct=='r') {
			if(move<0)
				return directL(dq,-1*move);
			else
				return directL(dq,move);
		}
		else {
			System.out.println("제대로 된 방향을 입력");
			return null;
		}
		
	}
	Deque directR(Deque dq,int move){
		for(int i=0;i<move;i++) {
			String word=(String)dq.pollLast();
			dq.addFirst(word);
		}
		return dq;
	}
	
	Deque directL(Deque dq,int move){
		for(int i=0;i<move;i++) {
			String word=(String)dq.pollFirst();
			dq.addLast(word);
		}
		return dq;
	}
	void print(Deque dq,int size) {
		for(int i=0;i<size;i++) {
			System.out.print(dq.pollFirst());
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		WordPush word=new WordPush();
		String str=scanner.next();
		int move=scanner.nextInt();
		char direct=scanner.next().charAt(0);
		Deque dq=word.inout(str,move,direct);
		word.print(dq, dq.size());
	}
}
