import java.util.Arrays;

public class T6_20 {

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:" + ArrayMax.max(data));
        System.out.println("최대값:" + ArrayMax.max(null));
        System.out.println("최대값:" + ArrayMax.max(new int[]{}));

        int value = 5;
        System.out.println(value + "의 절대값:" + Abc.abs(value));
        value = 10;
        System.out.println(value + "의 절대값:" + Abc.abs(value));

    }
}

class ArrayMax {

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        } else {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
    }
}

class Abc {

    public static int abs(int value) {
        if (value < 0) {
            return -value;
        } else {
            return value;
        }
    }
}