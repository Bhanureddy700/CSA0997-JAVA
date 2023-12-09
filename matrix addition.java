import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j;
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int arr3[][] = new int[3][3];
		System.out.println("enter elements in array:");
		for(i=0;i<3;i++){
		    for(j=0;j<3;j++){
		    arr1[i][j] = input.nextInt();
		}
		}
		System.out.println("enter elements in array:");
		for(i=0;i<3;i++){
		    for(j=0;j<3;j++){
		    arr2[i][j] = input.nextInt();
		}
		}
		System.out.println("After Addition..");
		for(i=0;i<3;i++){
		    for(j=0;j<3;j++){
		    arr3[i][j] = arr1[i][j]+arr2[i][j];
		    System.out.println(arr3[i][j]);
		}
		}
		
	}
}
