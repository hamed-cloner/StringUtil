import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking the length of String user wants to create
        System.out.print("Enter the length of String you want:");
        long length = scanner.nextLong();

        //Creating a random string using the given length
        String simpleString = StringUtils.randomStringGenerator(length);
        System.out.println("\nYour random string is:  " + simpleString);

        //Creating a random String using the given regular expression and length by user
        System.out.print("\nEnter the pattern of your String: ");
        String regex = scanner.next();
        String regexString = StringUtils.regexStringGenerator(regex , length);
        System.out.println("\nyour designed String is: " + regexString );

        //Sorting the lists
        String SortedFirst = StringUtils.sortString(simpleString);
        System.out.println("\nyour first String after sorting will be: " + SortedFirst);

        String SortedRegex = StringUtils.sortString(regexString);
        System.out.println("\nyour designed String after sorting will be: " + SortedRegex);

        //concatenation of these 2 Strings will be:
        String concat = StringUtils.concatString(SortedFirst, SortedRegex);
        System.out.println("\nthe concatenation of these 2 Strings will be: " +concat );

        //Search through the concatened String using a specific regex
        System.out.println("\nSearching through the final String...");
        StringUtils.searchString(concat, "this\s+is\s+text");
    }
}