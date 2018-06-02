import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        String[] ss = s.trim().split("[ !,?.\\_'@]+");
        
        if(s == null || s.equals("") || s.trim().equals("")){
            System.out.println("0");
        }else if(s.length()>400000){
            
        }else{
            System.out.println(ss.length);
        }
        for(int i=0;i<ss.length;i++){
           System.out.println(ss[i]);
        }
    }
}
