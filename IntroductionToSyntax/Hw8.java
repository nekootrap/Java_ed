import java.util.Arrays;

public class Hw8 {
    public static void main(String[] args) {
        System.out.println("task 1");

        int[] inputArray1 = {100, 10000, 50000, 45000, 90000};
        float[] outputArray1 = new float[4];
        float sum1 = 0;
        float max_value1 = 0;
        float min_value1 = 100000000;

        for (int ind : inputArray1) {
            sum1 += ind;
            max_value1 = max_value1 < ind ? ind : max_value1;
            min_value1 = min_value1 > ind ? ind : min_value1;
        }
        outputArray1[0] = sum1;
        outputArray1[1] = max_value1;
        outputArray1[2] = min_value1;
        outputArray1[3] = sum1 / (inputArray1.length);

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("task 2");

        int[] inputArray2 = {100, 10000, 50000, 45000, 90000};
        float[] outputArray2 = new float[5];
        int index2 = 0;

        for (int ind : inputArray2) {
            outputArray2[index2] = (ind * 13) / 100f;
            index2++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println("task 3");

        int[] inputArray3 = {100, 1000, 7000, 5000, 4000};
        boolean[] outputArray3 = new boolean[5];
        int index3 = 0;

        for (int ind : inputArray3) {
            if (ind >= 5000) {
                outputArray3[index3] = true;
            } else {
                outputArray3[index3] = false;
            }
            index3++;
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("task 4");

        int[] inputArray4 = {1000, 2000, -500, 4000, 5000};
        boolean[] outputArray4 = new boolean[1];
        boolean allPositive = true;

        for (int ind : inputArray4) {
            if (ind <= 0) {
                allPositive = false;
                break;
            }
        }
        outputArray4[0] = allPositive;

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println("task 5");

        int[] inputArray5 = {1000, -200, 0, 500, 300};
        int[] outputArray5 = new int[1];
        int count = 0;

        for (int ind : inputArray5) {
            if (ind > 0) {
                count++;
            }
        }
        outputArray5[0] = count;

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}