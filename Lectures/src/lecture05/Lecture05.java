package lecture05;
public class Lecture05{
	public static void main(String[] args) {
		
		// finally started on loops, was a challange about object generic types and .equals
		// vs ==, primatives are compared by value while objects are compared by memory
		// address with ==, use .equals for objects
		int max = 100;
		int[] N = new int[max];
		
		for(int i = 0; i < max; i++)
			N[i] = i;
		max = N[0];
		
		for(int j : N) { // scanns each element of N, so linear time N
			if(max < j) {
				max = j;
			}
		}
		
		int difference = Integer.MAX_VALUE;
		
		for(int k = 0; k < max-1; k++) {
			for(int l = k+1; l < max; l++) {
				if(N[l] - N[k] < difference) {
					difference = N[l] - N[k];
				}
			}
		}
		System.out.println(difference);
		System.out.println(max);
	}
}