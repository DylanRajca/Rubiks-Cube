public class Utils {
    public static <T> T[] reverseArr(T[] data) {

        reverseArr(data, 0, data.length - 1);
        return data;
    }

    private static <T> void reverseArr(T[] data, int low, int high) {

        if (low > high) {
            return;
        }
        T temp = data[low];
        data[low] = data[high];
        data[high] = temp;
        reverseArr(data, low + 1, high - 1);
    }

}
