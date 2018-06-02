import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        ArrayList<String> a = new ArrayList<>();
        
        
        for(int i=0;i<s.length()-(k-1);i++){
            a.add(s.substring(i,i+k));
        }
        
        smallest = a.get(0);
        
        for(int i=1;i<a.size();i++){
            if(smallest.compareTo(a.get(i))>0){
                smallest = a.get(i);
            }
        }
        
        largest = a.get(0);
        
        for(int i=1;i<a.size();i++){
            if(a.get(i).compareTo(largest)>0){
                largest = a.get(i);
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
