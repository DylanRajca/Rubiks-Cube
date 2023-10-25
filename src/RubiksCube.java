import java.util.Arrays;

public class RubiksCube {
    public static void main(String[] args) throws Exception {

        Cube rubiks = new Cube();
        rubiks.printOut();

        rubiks.turnHorizontalTopRight();
        // rubiks.turnHorizontalMiddleRight();
        // rubiks.turnHorizontalMiddleRight();
        rubiks.turnVerticalLeftDown();

        rubiks.printOut();
    }
}
