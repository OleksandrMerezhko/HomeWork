package les1;

public class ArraySumAll {

    public static void main(String[] args) {
        int[] arr1 = {45, 47, 26, 12}, arr2 = {7, 8, 21, 36, 2}, arr3 = {30, 40, 50};
        int[][] array = {arr1, arr2, arr3};
        int sum = 0;
        
        for(int index1 = 0; index1 < array.length; index1++) {
            for(int index2 = 0; index2 < array[index1].length; index2++)
                sum += array[index1][index2];
        }
        
        System.out.println(sum);
    }

}