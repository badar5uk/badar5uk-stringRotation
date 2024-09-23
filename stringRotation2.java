import java.util.Scanner;

public class stringRotation2 {
    public static void main(String[] args) {
        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstString = str1.next();
        Scanner str2 = new Scanner(System.in);
        System.out.println("Enter second word");
        String secondString = str2.next();
        areRotation(firstString, secondString);

    }

    public static boolean areRotation(String firstString, String secondString) {
        boolean res;
        String concString;
        concString = firstString.concat(firstString);
        System.out.println(concString);
        res = concString.contains(secondString);
        return res;
    }
}

