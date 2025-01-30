import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10]; 
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt()%42; 
		}
		
		int k;
		for(int j=0; j<array.length; j++) {
			for(k=0; k<j; k++) {
				if(array[j]==array[k])
					break;
			}
			if(j==k)
				count++;
		}
		System.out.println(count);
	}
}