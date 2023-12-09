import java.util.Scanner;
public class bhanu{
    public static void input(){
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter breadth:");
        double b = temp.nextInt();
        System.out.println("Enter height:");
        double h = temp.nextInt();
        // passing params to another function
        output(b, h);
    }
    
    public static void output(double b, double h){
        double area = 0.5*b*h;
        System.out.println("area of triangle:"+area);
    }
    
    public static void main(String[] args){
        input();
    }
}