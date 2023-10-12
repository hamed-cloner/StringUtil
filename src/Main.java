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
        System.out.println("Your random string is:  " + simpleString);

        //Creating a random String using the given regular expression and length by user
        System.out.print("Enter the pattern of your String: ");
        String regex = scanner.next();
        String regexString = StringUtils.regexStringGenerator(regex , length);
        System.out.println("your designed String is: " + regexString );

        //Sorting the lists
        String SortedFirst = StringUtils.sortString(simpleString);
        System.out.println("your first String after sorting will be: " + SortedFirst);

        String SortedRegex = StringUtils.sortString(regexString);
        System.out.println("your designed String after sorting will be: " + SortedRegex);

        //concatenation of these 2 Strings will be:
        String concat = StringUtils.concatString(SortedFirst, SortedRegex);
        System.out.println("the concatenation of these 2 Strings will be: " +concat );
    }
}