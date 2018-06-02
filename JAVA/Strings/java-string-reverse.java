import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String r = "";
        
        for(int i=1;i<=A.length();i++){
            r+=A.charAt(A.length()-i);
        }
        
        if(A.compareTo(r)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
