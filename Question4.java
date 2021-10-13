package lab12;

public class Question4 {
    public static String reverseString(String str, int index){
        String  reverseStr;
        if (index == str.length())
            return "";
        reverseStr = reverseString(str, index + 1);
        reverseStr += str.charAt(index);
        return reverseStr;
    }

    public static void main(String[] args){
        System.out.println(reverseString("Abdelaziz abou", 0));
    }
}
