
public class Table {
    // Final variables
    static final int XMAXSIZE = 50;
    static final int YMAXSIZE = 50;
    static final String aristaSymbol = "@";
    static String[][] map = new String[YMAXSIZE][XMAXSIZE];

    public Table() {
    }

    public static void showTable(Point[][] listPoints){
        int x = 0;
        Point[] points = new Point[listPoints.length * listPoints[0].length];
        for (int i = 0; i < listPoints.length; i++) {
            for (int j = 0; j < listPoints[i].length; j++) {
                points[x] = listPoints[i][j];
                x++;
            }
        }
        showTable(points);
    }
    public static void showTable(Point[] listPoints) {
        setPointsInMap(listPoints);

        System.out.print("  ");
        for (int i = 0; i < map[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

public static void setPointsInMap(Point[] listPoints) {

    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length; j++) {
            map[i][j] = " ";
        }
    }

    for (Point p : listPoints) {
        if (p.getX() >= 0 && p.getX() < XMAXSIZE && p.getY() >= 0 && p.getY() < YMAXSIZE) {
            map[p.getY()][p.getX()] = aristaSymbol;
        }
    }
}
}

/*
Point: x = 5 y = 5
Point: x = 10 y = 1
Point: x = 9 y = 12
Point: x = 16 y = 17
Point: x = 17 y = 19
Point: x = 7 y = 6
Point: x = 15 y = 9
Point: x = 16 y = 6
Point: x = 12 y = 5
Point: x = 17 y = 13
*/