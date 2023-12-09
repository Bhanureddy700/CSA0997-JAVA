import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    int i;
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name.length());
        for(i=0;i<3;i++){
            String a = input.nextLine();
            System.out.println(a);
        }
	}
}
