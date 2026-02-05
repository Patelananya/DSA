// package Recursion;
import java.util.*;

public class TOH {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,"src","dest","aux");
    }
    public static void toh(int n, String src, String dest, String aux){
        if(n==1){
            System.out.println("Move disk "+ n+ " from "+src+" to "+dest);
            return;
        }
        toh(n-1,src,aux,dest);
        System.out.println("Move disk "+ n+ " from "+src+" to "+dest);
        toh(n-1,aux,dest,src);
    }
}
