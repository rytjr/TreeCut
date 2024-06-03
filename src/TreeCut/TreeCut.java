package TreeCut;

import java.util.*;

public class TreeCut {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int Num2 = sc.nextInt();
		
		int[] arr = new int[Num];
		
		for(int i = 0; i < Num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i = 0; i < Num; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int min = 0;
		int answer = 0;
		
		while(min <= max) {
			
			int middle = (min + max) / 2;
			
			long count = 0;
			
			for(int i = 0; i < Num; i++) {
				if(arr[i] > middle) {
					count += arr[i] - middle;
				}
			}
			
			if(count >= Num2) {
				if(answer < middle) {
					answer = middle;
				}
				min = middle + 1;
			}else {
				max = middle - 1;
			}
			
		}
		
		System.out.print(answer);
	}

}
