
public class Table {
    // Final variables
    static final int XMAXSIZE = 10;
    static final int YMAXSIZE = 10;
    static final int XMINSIZE = 10;
    static final int YMINSIZE = 10;
    static final String aristaSymbol = "@";
    static String[][] map = new String[YMAXSIZE][XMAXSIZE];

    public Table() {
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
                for (int x = 0; x < listPoints.length; x++) {
                    if (listPoints[x].getX() == j && listPoints[x].getY() == i) {
                        map[i][j] = aristaSymbol;
                        break;
                    } else {
                        map[i][j] = " ";
                    }
                }
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