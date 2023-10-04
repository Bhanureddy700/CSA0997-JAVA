import java.util.Scanner;
class Sort{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = temp.nextInt();
        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = temp.nextInt();
        }
        int c = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(array[i]>array[j]){
                    c = array[i];
                    array[i]=array[j];
                    array[j]=c;
                }
            }
        }
        System.out.println("after sorting:");
        for(int i = 0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}