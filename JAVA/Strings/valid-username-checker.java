import java.util.Scanner;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^\\p{Alpha}([\\p{Alnum}_]){7,29}$";
    
    // Pattern r = Pattern.compile("^\\p{Alpha}([\\p{Alnum}_]){7,29}$");
    // Matcher m = r.matcher(username);
    
    
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
