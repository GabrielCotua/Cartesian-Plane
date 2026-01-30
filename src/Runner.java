import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        // final variable
        final int NUMPOINTS = 3;

        Point[] pList = new Point[NUMPOINTS];
        Random rand = new Random();
        rand.setSeed(220818);

        // Fills the array with points
        for (int i = 0; i < NUMPOINTS; i++) {
            pList[i] = new Point(rand.nextInt(Table.XMAXSIZE), rand.nextInt(Table.YMAXSIZE));
        }
        
        // Shows the point
        for (Point i : pList) {
            System.out.println(i);
        }

        // Show the distance between points in order they are in the array 
        for (int i = 1; i < NUMPOINTS; i++) {
            System.out.printf("Distance between point %d and %d = %.2f\n", i - 1, i,
                    pList[i - 1].getDistance(pList[i]));
        }

        Table.showTable(pList);
    }
}
