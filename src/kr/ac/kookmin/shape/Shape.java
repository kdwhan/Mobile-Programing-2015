package kr.ac.kookmin.shape;

public abstract class Shape {
	protected Point center;
	
	public abstract void draw(Graphics g);

	public abstract Rectangle getBounds();
	
	public abstract Point getCenter();
	
	
	
}
