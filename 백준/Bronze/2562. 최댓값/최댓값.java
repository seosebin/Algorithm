import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];
        int max = array[0];
        int count = 0;
        
        for(int i=0; i<array.length; i++) {
        	array[i] = sc.nextInt();
        	
        	if(array[i]>max) {
        		max = array[i];
        		count = i+1;
        	}
        }
        System.out.println(max+"\n"+count);
    }
}