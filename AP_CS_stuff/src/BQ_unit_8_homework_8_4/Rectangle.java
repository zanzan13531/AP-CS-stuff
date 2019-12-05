package BQ_unit_8_homework_8_4;

public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public Rectangle(GridPoint p, int width, int height) {
		
		x = p.getX();
		y = p.getY();
		this.width = width;
		this.height = height;
		
	}
	
	public int getHeight() {
		return (height);
	}
	
	public int getWidth() {
		return (width);
	}
	
	public int getX() {
		return(x);
	}
	
	public int getY() {
		return(y);
	}
	
	public String toString() {
		return("Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]");
	}
	
	public boolean contains(int x, int y) {
		return (((x <= (this.x + width)) && (x >= this.x)) && ((y <= (this.y + height)) && (y >= this.y)));
	}
	
	public boolean contains(GridPoint p) {
		return (((p.getX() <= (this.x + width)) && (p.getX() >= this.x)) && ((p.getY() <= (this.y + height)) && (p.getY() >= this.y)));
	}
	
}