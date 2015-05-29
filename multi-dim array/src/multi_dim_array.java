import java.util.Scanner;


public class multi_dim_array {
	public static void main(String[] args) {
		int[] values = {10, 23, 18, 99};
		
		for(int value: values){
			System.out.println(value);
		}
		
		int[][]grid = {
				{9, 18, 45},
				{12, 14, 99},
				{2, 77, 11}
		};
		//multipliction table
		System.out.println(grid[1][1]);
		Scanner input = new Scanner(System.in);
		System.out.println("What is the max value: ");
		int x = input.nextInt();
		int [][] grid2 = new int [32][32];
		for(int i = 0; i <= x; i++){
			for(int l = 0; l <= x; l++){
				grid2[i][l]= i * l;	
			}
		}
		
		for(int i = 1; i <= x ;i++){
			for(int l = 1 ; l <= x; l++){
				System.out.print(grid2[i][l] + "\t");	
			}
			
				System.out.println();
		}
	}
}
