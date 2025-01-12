import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int m = sc.nextInt();
        int temp;
        
        for(int a=0; a<array.length; a++) {
        	array[a] = a+1;
        }
        
        for(int b=0; b<m; b++) {
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	
        	temp = array[i-1];
        	array[i-1] = array[j-1];
        	array[j-1] = temp;
        }
        
        for(int c=0; c<array.length; c++) {
        	System.out.print(array[c]+" ");
        }
        
	}
}