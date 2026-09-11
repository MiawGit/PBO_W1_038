import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String A = input.nextLine();
        String B = input.nextLine();

        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalA + " " + capitalB);

        input.close();
    }
}
