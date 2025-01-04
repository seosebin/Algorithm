import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] array = new int[n];
        
        int x = sc.nextInt(); 
        
        for(int i=0; i<n; i++) {
        	array[i]=sc.nextInt(); 
        }
        
        for(int j=0; j<array.length; j++) {
        	if(array[j]<x) {
        		System.out.println(array[j]);
        	}
        }
    }
}