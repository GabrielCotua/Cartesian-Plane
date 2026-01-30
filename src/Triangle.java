import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Triangle extends Point implements Shape {

    private final int numAristas = 3;
    private Point[] pList = new Point[numAristas]; // List of points
    private Random rand = new Random();


    public Triangle() {
        rand.setSeed(2);
        pList[0] = new Point(rand.nextInt(), rand.nextInt());
        pList[1] = new Point(rand.nextInt(), rand.nextInt());
        pList[2] = new Point(rand.nextInt(), rand.nextInt());
    }
    public Triangle(Point p1, Point p2) {
        pList[0] = p1;
        pList[1] = p2;
        pList[2] = new Point(rand.nextInt(), rand.nextInt());
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
    public int getSlant(Point p1, Point p2) {
        return (int) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    @Override
    public void draw() {
        int[] distance = new int[numAristas];
        int[] slant = new int[numAristas]; // slant in between points
        HashMap<Integer,Point> mPoints = new HashMap<Integer, Point>(); // Points located in between aristas
        Point prevPoint = new Point();


        if (pList.length !=3) {
            System.out.println("Triangle needs 3 points");
            return;
        }

        // gets all slants of the shape
        for (int i = 1; i < pList.length; i++) {
            slant[i] = getSlant(pList[i-1], pList[i]);
        }

        // get to know the amount of spaces in between each point
        for (int i = 1; i < distance.length; i++) {
           distance[i] = (int) Math.abs(pList[i-1].getDistance(pList[i])); // To know how many spaces to draw for
        }

        //override the amount of middle points
        for (int i = 0; i < distance[i]; i++) {
            mPoints.put(i, pList[i]);
        }

        prevPoint.setX(pList[0].getX() * slant[0]);
        prevPoint.setY(pList[0].getY() * slant[0]);
        // get points located in between the aristas
        for (int i = 0; i < mPoints.size(); i++) {
            mPoints.get(i).setY(prevPoint.getY());
            mPoints.get(i).setX(prevPoint.getX());
            prevPoint = mPoints.get(i);

            prevPoint.setX(pList[0].getX() * slant[0]);
            prevPoint.setY(pList[0].getY() * slant[0]);
        }

        // Show points
        for (int i = 1; i < mPoints.size(); i++) {
            System.out.println(mPoints.get(i));
        }

        // Table.showTable(mPoints.toArray(new Point[0]));


    }

    public void draw2() {
        int distance;
        int slant;
        Point nextPoint = new Point();
        Point prevPoint = pList[0];
        Point[][] middlePoints = new Point[3][10];
        for (int i = 1; i < 3; i++) {
            slant = pList[i].getSlant();
            for (int j = 1; j < (int) (pList[i-1].getDistance(pList[i])); j++) {
                nextPoint.setX(prevPoint.getX() * slant)
\            }
        }
        

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
