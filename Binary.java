import java.util.Scanner;
public class Binary{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = temp.nextInt();
        System.out.println("enter a number to search:");
        int k = temp.nextInt();
        int[] array = new int[n];
        System.out.println("enter elements in array:");
        for(int i=0;i<n;i++){
            array[i] = temp.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(k == array[i]){
                System.out.println(k+ "present at position:"+i);
            }
        }
    }
}