import java.util.Arrays;

public class Cube {

    private Side[] cubeMatrix;
    private Side front;
    private Side left;
    private Side right;
    private Side back;
    private Side top;
    private Side bottom;

    public Cube() {
        front = new Side("orange");
        left = new Side("green");
        right = new Side("blue");
        back = new Side("red");
        top = new Side("yellow");
        bottom = new Side("white");

        cubeMatrix = new Side[] { top, front, right, back, left, bottom };
    }

    public Object[] getCubeMatrix() {
        return cubeMatrix;
    }

    public void printOut() {

        System.out.println("\n  ~~RUBIKS CUBE~~");
        String sideType;
        for (int i = 0; i < cubeMatrix.length; i++) {
            switch (i) {
                case 0:
                    sideType = "        Top";
                    break;
                case 1:
                    sideType = "        Front";
                    break;
                case 2:
                    sideType = "        Right";
                    break;
                case 3:
                    sideType = "        Back";
                    break;
                case 4:
                    sideType = "        Left";
                    break;
                case 5:
                    sideType = "        Bottom";
                    break;
                default:
                    sideType = "";
                    break;
            }
            System.out.println(sideType);
            Side side = cubeMatrix[i];

            for (String[] row : side.getSideMatrix()) {
                System.out.println(Arrays.toString(row));
            }
            // System.out.println(Arrays.deepToString(side.getSideMatrix()));
        }
    }

    public void turnHorizontalTopRight() {
        String[] temp = front.getHorizontalTopRow();
        front.setHorizontalTopRow(left.getHorizontalTopRow());
        left.setHorizontalTopRow(back.getHorizontalTopRow());
        back.setHorizontalTopRow(right.getHorizontalTopRow());
        right.setHorizontalTopRow(temp);
    }

    public void turnHorizontalMiddleRight() {
        String[] temp = front.getHorizontalTopRow();
        front.setHorizontalMiddleRow(left.getHorizontalMiddleRow());
        left.setHorizontalMiddleRow(back.getHorizontalMiddleRow());
        back.setHorizontalMiddleRow(right.getHorizontalMiddleRow());
        right.setHorizontalMiddleRow(temp);
    }

    public void turnHorizontalBottomRight() {
        String[] temp = front.getHorizontalTopRow();
        front.setHorizontalBottomRow(left.getHorizontalBottomRow());
        left.setHorizontalBottomRow(back.getHorizontalBottomRow());
        back.setHorizontalBottomRow(right.getHorizontalBottomRow());
        right.setHorizontalBottomRow(temp);
    }

    public void turnVerticalLeftDown() {
        String[] temp = front.getVerticalLeftRow();
        front.setVerticalLeftRow(top.getVerticalLeftRow());
        top.setVerticalLeftRow(Utils.reverseArr(back.getVerticalRightRow()));
        back.setVerticalRightRow(bottom.getVerticalLeftRow());
        bottom.setVerticalLeftRow(temp);
    }
}
