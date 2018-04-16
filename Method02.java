package les1;

import java.util.Arrays;
public class Method02 {

    static int accept(int[] firstarray){
        for(int index = 0; index < 3; index++) 
            firstarray[index]++;
            return firstarray[0]+firstarray[1]+firstarray[2];
        
    }
    public static void main(String[] args){
        int[] firstarray = new int[] {101, 210, 354, 478, 586, 689, 791}; //secondarray
        int sum = accept(firstarray);
        String array = Arrays.toString(firstarray);
        System.out.println("Array is " + array);
        System.out.println("Sum of three is " + sum);
    }
}