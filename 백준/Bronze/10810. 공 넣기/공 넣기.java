import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int m = sc.nextInt();
        
        for(int a=0; a<m; a++) {
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	int k = sc.nextInt();
        	
        	for(int b=i-1; b<j; b++ ) {
        		array[b] =k; 
        	}
        }
        for(int c=0; c<array.length; c++) {
        	System.out.print(array[c]+" ");
        }
        
	}
}
