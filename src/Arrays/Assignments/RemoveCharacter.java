package Arrays.Assignments;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String result = input.replaceAll(String.valueOf(toRemove), "");
        System.out.println("String after removing '" + toRemove + "': " + result);
    }
}
