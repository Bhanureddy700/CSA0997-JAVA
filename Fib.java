import java.util.Scanner;

public class Fib{
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer1: ");
        int number = input.nextInt();
int fact = 1;
        for(int i=1;i<=number;i++){
           fact = fact*i;
}
 System.out.println("factorial: "+fact);
    }
}