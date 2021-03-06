public class Point {
  private int x, y;
  
  public Point(int x, int y) {this.x = x;this.y = y;}
  public double distanceTo(Point other) {
    return Math.sqrt((x-other.x)^2 + (y-other.y)^2);
  }
  public void copyTo(Point p) {
    p.x = this.x; p.y = this.y;
  }
  public double distanceToOrigin() {
    return distanceTo(new Point(0,0));
  }
  public void swapMyCoordinates() {
    int tmp = this.x;
    this.x = y;
    this.y = tmp;     
  }

  @Override
  public boolean equals(Object obj) {
      if (obj == null)
    	  return false;
	  Point that = (Point) obj;
      if (this.x == that.x && this.y == that.y) 
          return true;
      return false;
  }

  @Override
  public int hashCode() {
      return this.x + this.y;
  }

}
