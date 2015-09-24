package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	int width;
	int height;
	
	public Rectangle(Point p, int x, int y) {
		this.center = p;
		this.width = x;
		this.height = y;
	}

	public Rectangle getBounds() {
		return this;
	}
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}

	@Override
	public Point getCenter() {
		return this.center;
	}

	
}
