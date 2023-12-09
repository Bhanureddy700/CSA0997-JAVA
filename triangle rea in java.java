import java.util.Scanner;
class reddy{
    public static void input(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the details of triangle:");
        int l = abc.nextInt();
        int b = abc.nextInt();
        int h = abc.nextInt();
        output(l,b,h);
    }
    public static void output(int l,int b,int h){
        System.out.println((l*b*h)+" this is the area of triangle...");
    }
    public static void main(String[] args){
        reddy bhanu = new reddy();
        bhanu.input();
    }
}