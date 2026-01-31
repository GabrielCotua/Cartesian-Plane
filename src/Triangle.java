
import java.util.Random;

public class Triangle implements Shape {

    private final int numAristas = 3;
    private Point[] pList = new Point[numAristas]; // List of points
    private Random rand = new Random();


    public Triangle() {
        //rand.setSeed(2);
        pList[0] = new Point(rand.nextInt(1, Table.XMAXSIZE), rand.nextInt(1, Table.YMAXSIZE));
        pList[1] = new Point(rand.nextInt(1, Table.XMAXSIZE), rand.nextInt(1, Table.YMAXSIZE));
        pList[2] = new Point(rand.nextInt(1, Table.XMAXSIZE), rand.nextInt(1, Table.YMAXSIZE));
    }

    public Triangle(Point p1, Point p2) {
        pList[0] = p1;
        pList[1] = p2;
        pList[2] = new Point(rand.nextInt(1, Table.XMAXSIZE), rand.nextInt(1, Table.YMAXSIZE));
    }

    public Triangle(Point p1, Point p2, Point p3) {
        pList[0] = p1;
        pList[1] = p2;
        pList[2] = p3;
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
        return 0;
    }

    @Override
    public void draw() {
        // We will collect all points (vertices + lines) into one list
        // 3 sides * 10 points per side = 30 points
        int[] steps = { (int) pList[0].getDistance(pList[1]),
                        (int) pList[1].getDistance(pList[2]),
                        (int) pList[2].getDistance(pList[0])};
        Point[] allPoints = new Point[(steps[1] + steps[2] + steps[0]) ];
        int counter = 0;

        // Connect: p0->p1, p1->p2, and p2->p0
        counter = interpolate(pList[0], pList[1], allPoints, counter, steps[0]);
        counter = interpolate(pList[1], pList[2], allPoints, counter, steps[1]);
        counter = interpolate(pList[2], pList[0], allPoints, counter, steps[2]);

        Table.showTable(allPoints);
    }

    // Helper method to fill points between two vertices
    private int interpolate(Point start, Point end, Point[] list, int index, int steps) {

        for (int i = 0; i < steps; i++) {
            double t = (double) i / (steps - 1);
            int newX = (int) Math.round(start.getX() + t * (end.getX() - start.getX()));
            int newY = (int) Math.round(start.getY() + t * (end.getY() - start.getY()));

            list[index++] = new Point(newX, newY);
        }
        return index;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
