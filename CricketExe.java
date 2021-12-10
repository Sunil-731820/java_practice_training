package com.java.static1;

public class CricketExe {
	static int score;
	public void incr(int x) {
		score +=x;
	}
	public static void main(String[] args) {
		CricketExe fb = new CricketExe();
		CricketExe sb = new CricketExe();
		CricketExe tb = new CricketExe();
		fb.incr(120);
		sb.incr(15);
		tb.incr(9);
		System.out.println("the Total score of the match is " + CricketExe.score);
	}
	
}
