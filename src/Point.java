
public class Point implements Shape{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Point() {
        this(0, 0);
    }

    public void setX(int x) { this.x = x; }

    public int getX() { return this.x; }

    public void setY(int y) { this.y = y; }

    public int getY() { return this.y; }

    public double getDistance(Point other) {
        return Math.sqrt((Math.pow(other.getX() - this.getX(), 2)) + (Math.pow(other.getY() - this.getY(), 2)));
    }

    public static double powerOf(double base, double exponent) {
        double value = 1.0;
        for (double i = 0.0; i < exponent; i++) {
            value *= base;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Point: x = " + this.x + " y = " + this.y;
    }


    @Override
    public double getArea() {
        return 0;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }


    @Override
    public int getSlant(Point p1, Point p2) {
        return (int) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }



    @Override
    public void draw() {

    }
}
