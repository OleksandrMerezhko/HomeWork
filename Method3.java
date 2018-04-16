package les1;

// Написать ф-ю, которая принимает на вход массив чисел и возвращает его длину в байтах как результат.

public class Method3 {

    private static int sizeinbyte(byte[] array) {
        return array.length;
    }
    private static int sizeinbyte(short[] array) {
        return array.length* 2;
    }
    private static int sizeinbyte(int[] array) {
        return array.length* 4;
    }
    private static int sizeinbyte(long[] array) {
        return array.length* 8;
    }
    
    public static void main(String[] args) {
        byte[] array1 = {1, 2, 3};
        short[] array2 = {7, 8, 10, 13};
        int[] array3 = {112, 232, 343, 456};
        long[] array4 = {12345, 4578, 7845, 7896, 1254, 15648};
        System.out.println(sizeinbyte(array1));
        System.out.println(sizeinbyte(array2));
        System.out.println(sizeinbyte(array3));
        System.out.println(sizeinbyte(array4));
    }
}