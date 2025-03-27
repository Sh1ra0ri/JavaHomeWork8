import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        int[] array2 = {54, 76, 456, 123, 789};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}