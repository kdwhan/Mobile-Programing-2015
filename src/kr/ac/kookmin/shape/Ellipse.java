package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	int w;
	int h;
	
	Ellipse(Point p, int x, int y)
	{
		this.center = p;
		this.w = x;
		this.h = y;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}

	@Override
	public Point getCenter() {
		return this.center;
	}
}
