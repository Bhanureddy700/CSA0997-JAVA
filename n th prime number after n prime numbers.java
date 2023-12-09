import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i=2,c =0,j,k=0,l;
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int d = n+n;
        int [] a=new int [d];
        while(c<=d-1){
           for(j=1;j<=i;j++){
               if(i%j==0){
                   k = k + 1;
               }
           }
           if(k <= 2){
               a[c] = i;
               c = c + 1;
           }
           k = 0;
           i = i + 1;
        }
        System.out.println(n+" prime numbers after "+n+" th prime number:");
        for(l=n;l<c;l++){
            System.out.println(a[l]);
        }
    }
}