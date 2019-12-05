package BQ_unit_8_homework_8_4;

public class GridLine {
	
	private GridPoint p1;
	private GridPoint p2;
	
	public GridLine(GridPoint p1, GridPoint p2) {
		
		this.p1 = p1;
		this.p2 = p2;
		
	}
	
	public GridLine(int x1, int y1, int x2, int y2) {
	    p1 = new GridPoint(x1, y1);
	    p2 = new GridPoint(x2, y2);
	}
	
	public GridPoint getP1() {
		return (p1);
	}
	
	public GridPoint getP2() {
		return (p2);
	}
	
	public String toString() {
		return ("[" + p1.toString() + ", " + p2.toString() + "]");
	}
	
	public double getSlope() {
	    return ((1.0*p2.getY()-p1.getY())/(1.0*p2.getX()-p1.getX()));
	}
	
}