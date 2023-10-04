import java.util.Scanner;
public class sumofevendigits{
    public static void main(String[] args){
        Scanner arm = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = arm.nextInt();
        int r = 0,c=0;
        while(n > 0){
            r = n % 10;
            if(r%2 == 0){
                c += r;
            }
            n = n/10;
        }
        System.out.println(c);
    }
}