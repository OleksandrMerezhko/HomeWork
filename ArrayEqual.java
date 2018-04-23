package les1;

public class ArrayEqual {

    public static void main(String[] args) {
        
        short [] mas1 = {1, 2, 3, 4, 5}, mas2 = {1, 2, 3, 4};

        if (arrayEqual(mas1, mas2)) {
            System.out.println("Arrays are equivalent");
        }else {
            System.out.println("Arrays are not equivalent");
        }
    }
    
    public static Boolean arrayEqual(short [] arr1, short [] arr2 ){

        if(arr1.length != arr2.length){
            return false;
        }
        for (int index=0; index<arr1.length; index++){
            if(arr1[index]!=arr2[index]){
                return false;
            }
        }
        return true;
    }
}