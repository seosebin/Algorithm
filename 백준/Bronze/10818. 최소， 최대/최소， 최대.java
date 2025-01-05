import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        
        for(int i=0; i<array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        int min=array[0];
        for(int j=0; j<array.length; j++) {
        	if(array[j]<min)
        		min=array[j];
        }
        
        int max=array[0];
        for(int j=0; j<array.length; j++) {
        	if(array[j]>max)
        		max=array[j];
        }
        
        System.out.println(min+" "+max);
    }
}