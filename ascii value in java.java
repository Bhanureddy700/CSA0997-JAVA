import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String str = abc.nextLine();
		int i;
		
		for(i=0;i<str.length();i++){
		    int a = str.charAt(i);
		    if((a>65 && a<90) && (a<97 && a>122)){
		        System.out.println("Given user name is invalid");
		    }
		    System.out.println(a);
		}
		
	}
}
