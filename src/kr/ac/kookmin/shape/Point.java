package kr.ac.kookmin.shape;

public class Point {
	int x;
	int y;
	
	Point(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	int getX() {
		return this.x;
	}
	void setX(int x) {
		this.x = x;
	}
	
	int getY() {
		return this.y;
	}
	void setY(int y) {
		this.y = y;
	}
}
