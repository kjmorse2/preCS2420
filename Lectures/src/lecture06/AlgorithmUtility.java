package lecture06;

public class AlgorithmUtility {
	// actuall algorithm, also includes comparable version 
	
	public static <E extends Comparable<? super E>> E findMax(E[] arr) {
		if(arr.length == 0)
			throw new NoSuchElementException();
		
		E max = arr[0];
		for(int i = 1; i < arr.length; i++)
			if(arr[i].compareTo(max) > 0) {
				max = arr[i];
			}
		return max;
	}

}
