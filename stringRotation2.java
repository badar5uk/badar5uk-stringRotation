import java.util.Scanner;

public class stringRotation2 {
    public static void main(String[] args) {
        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstString = str1.next();
        Scanner str2 = new Scanner(System.in);
        System.out.println("Enter second word");
        String secondString = str2.next();

        char[] array = firstString.toCharArray();
        char[] array2 = secondString.toCharArray();
        if (array[array.length-1] == array2[0]) {
            System.out.println("Is a rotation of ");
        }
        else {
            System.out.println("Not a rotation");
        }
    }
}
