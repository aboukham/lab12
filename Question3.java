package lab12;

public class Question3 {
    public static int sumOfArrayElements(int[] arr, int index){
        if (index == arr.length)
            return 0;
        return arr[index] + sumOfArrayElements(arr, index + 1);
    }

    public static void main(String[] args){
        int[] arr = {-12, 45};
        System.out.println(sumOfArrayElements(arr, 0));
    }
}
