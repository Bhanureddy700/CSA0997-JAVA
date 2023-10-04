import java.util.Scanner;
public class strrev{
    public static void main(String[] args){
        Scanner vark = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String name = vark.nextLine();
        String reversed = "";
        for(int i=0;i<name.length();i++){
            reversed = name.charAt(i)+reversed;
        }
        System.out.println("Afetr reversing:"+reversed);
    } 
}