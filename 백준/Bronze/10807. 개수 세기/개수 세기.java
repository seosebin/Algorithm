import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;	
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for(int j = 0; j < array.length; j++){ 
            if(v == array[j]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
