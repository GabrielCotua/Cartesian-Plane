
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
    public double getSlant(Point other) {
        if (this.getX() - other.getX() == 0) {
            return 0;
        }

        return Math.round((long)((double)(this.getY() - other.getY()) / (double)(this.getX() - other.getX())));
    }



    @Override
    public void draw() {

    }

    public static void showPoints(Point[] pList) {
            for (Point x : pList) {
                System.out.println(x);
        }
    }

    public static void showPoints(Point[][] pList) {
        for (int i = 0; i < pList.length; i++) {
            for (int  j = 0; j < pList[i].length; j++) {
                System.out.println(pList[i][j]);
            }
        }
    }
}
