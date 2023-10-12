import java.util.*;
public class StringUtils {

// Random string generator using a length given by user
    public static String randomStringGenerator(long length){
        String ExampleString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(Math.toIntExact(length));
        for(int i = 0 ; i < length ; i++){
            int index = (int)(ExampleString.length() * Math.random());
            sb.append(ExampleString.charAt(index));
        }
        return sb.toString();
    }

    public static String regexStringGenerator(String regex, long length){
        Random rand = new Random();
        String randomString = "";
        int n = 0;
        while (length > 0){
            n = rand.nextInt(94) + 33;
            char c = (char)n;
            if(Character.toString(c).matches(regex) && Character.isLetter(c)){
                randomString += c;}
            else{
                continue;
            }
            length--;
        }
        return randomString;
    }

    public static String sortString(String inputString){
        String sortedString = inputString
                .chars()
                .sorted()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                )
                .toString();
        return sortedString;
    }

    public static String concatString(String first, String second){
        String concatenaion = first.concat(second);
        return concatenaion;
    }
}
