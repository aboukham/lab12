package lab12;

public class Question2 {
    public static int smallestOfArray(int[] arr, int index){
        int min;
        if (index == arr.length - 1)
           return arr[index] ;
        min = smallestOfArray(arr, index + 1);
        return (min > arr[index])? arr[index] : min;
    }

    public static void main(String[] args){
        int[] arr = {12, 7, 84, 89};
        System.out.println(smallestOfArray(arr, 0));
    }
}
