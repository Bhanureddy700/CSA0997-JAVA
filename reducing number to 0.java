import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int c =0;
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        while(num >0){
            if(num % 2 == 0){
              num = num /2;
              c = c + 1;
            }
            else{
                num = num - 1;
                c= c + 1;
            }
        }
        System.out.println(c);
    }
}