import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = n.nextLine();
        String s = " ";
        int i;
        for(i=0;i<str.length();i++){
            s = str.charAt(i) + s;
            
        }
        System.out.println(s);
    }
}