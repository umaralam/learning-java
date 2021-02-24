package referencing.objects;

public class Point {

	public int x;
	public int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o){
		if(!(o instanceof Point)) return false;
		
		else{	
		Point point = (Point)o;
			return point.x == x && point.y == y;
		}
	}
}
