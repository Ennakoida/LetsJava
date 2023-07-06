package com.kh.day09.objpkg;

public class Point {
	private int x, y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj; // obj는 부모이기 때문에 바로 쓸 수 없다. 캐스팅 필요
		
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
	}
}
