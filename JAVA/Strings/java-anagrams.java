import java.io.*;
import java.util.*;

public class Solution {
  static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] x = a.toLowerCase().toCharArray();
        char[] y = b.toLowerCase().toCharArray();
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        if((new String(x)).equals(new String(y))){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
