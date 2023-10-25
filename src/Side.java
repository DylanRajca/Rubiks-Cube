import java.util.Arrays;

public class Side {

    private String color;
    private String[][] sideMatrix = new String[3][3];

    public Side(String color) {
        this.color = color;
        for (String[] row : sideMatrix) {
            Arrays.fill(row, color);
        }
    }

    public String[][] getSideMatrix() {
        return sideMatrix;
    }

    /** Horizontal Rows */
    public String[] getHorizontalTopRow() {
        return sideMatrix[0];
    }

    public String[] getHorizontalMiddleRow() {
        return sideMatrix[1];
    }

    public String[] getHorizontalBottomRow() {
        return sideMatrix[2];
    }

    public void setHorizontalTopRow(String[] row) {
        sideMatrix[0] = row;
    }

    public void setHorizontalMiddleRow(String[] row) {
        sideMatrix[1] = row;
    }

    public void setHorizontalBottomRow(String[] row) {
        sideMatrix[2] = row;
    }

    /** Vertical Rows */
    public String[] getVerticalLeftRow() {

        String[] row = new String[] { sideMatrix[0][0], sideMatrix[1][0], sideMatrix[2][0] };
        return row;
    }

    public String[] getVerticalRightRow() {

        String[] row = new String[] { sideMatrix[0][2], sideMatrix[1][2], sideMatrix[2][2] };
        return row;
    }

    public String[] getVerticalCenterRow() {

        String[] row = new String[] { sideMatrix[0][1], sideMatrix[1][1], sideMatrix[2][1] };
        return row;
    }

    public void setVerticalLeftRow(String[] row) {
        sideMatrix[0][0] = row[0];
        sideMatrix[1][0] = row[1];
        sideMatrix[2][0] = row[2];
    }

    public void setVerticalRightRow(String[] row) {
        sideMatrix[0][2] = row[0];
        sideMatrix[1][2] = row[1];
        sideMatrix[2][2] = row[2];
    }

    public void setVerticalCenterRow(String[] row) {
        sideMatrix[0][1] = row[0];
        sideMatrix[1][1] = row[1];
        sideMatrix[2][1] = row[2];
    }

    // * Side Rotations */
}
