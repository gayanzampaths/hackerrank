import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                s=sc.nextLine();
                String s2[]=s.split(" ");
                System.out.print(s2[0]);
                for(int k=0;k<15-s2[0].length();k++){
                    System.out.print(" ");
                }
                if(s2[1].length()==3){
                    System.out.print(s2[1]);
                }else{
                    for(int j=0;j<3-s2[1].length();j++){
                        System.out.print("0");
                    }
                    System.out.print(s2[1]);
                }
                System.out.println();
            }
            System.out.println("================================");

    }
}
