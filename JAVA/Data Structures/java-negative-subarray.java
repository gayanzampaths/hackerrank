import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int [] arr = new int[c];
        int maxCount=0;
        for(int i=0 ; i<c ; i++){
            arr[i]=s.nextInt();
            int sum = 0;
            for(int j = i ; j>=0 ; j--){
                sum+=arr[j];
                if(sum<0){
                    maxCount++;
                    //System.out.println(i+":"+j);
                }

            }
        }
        System.out.println(maxCount);
    }
}
