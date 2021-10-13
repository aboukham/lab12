package lab12;

public class Question1 {
    public static int countCharacters(String str){
        if (str.equals(""))
            return 0;
        return 1 + countCharacters(str.substring(1));
    }

    public static void main(String[] args){
        System.out.println(countCharacters("abdelaziz"));
    }
}
