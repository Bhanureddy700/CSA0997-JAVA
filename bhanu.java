import java.util.Scanner;
public class bhanu{
    public void calculation(){
         Scanner temp = new Scanner(System.in);
        System.out.println("Enter breadth:");
        double b = temp.nextInt();
        System.out.println("Enter height:");
        double h = temp.nextInt();
        double area = 0.5*b*h;
        System.out.println("area of triangle:"+area);
    }
    public static void main(String[] args){
        bhanu myobj = new bhanu();
        myobj.calculation();
        
    }
}