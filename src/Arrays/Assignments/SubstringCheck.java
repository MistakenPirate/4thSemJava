package Arrays.Assignments;

import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a substring to check: ");
        String substring = scanner.nextLine();

        if (input.contains(substring))
            System.out.println("Substring is present.");
        else
            System.out.println("Substring is not present.");
    }
}
