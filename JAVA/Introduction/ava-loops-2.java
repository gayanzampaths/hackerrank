import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            printSum(a,b,n);
        }
        in.close();
    }
    
    static void printSum(int a,int b, int n){
        int y=1;
        int sum=0;
        for(int x=1;x<=n;x++){
            sum+=a;
            for(int z=0;z<x;z++){
                sum+=(y*b);
                y*=2;
            }
            System.out.print(sum+" ");
            y=1;
            sum=0;
        }
        System.out.println();
    }
}
