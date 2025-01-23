package lecture06;

import java.util.Random;
// extension of TimingExperiment to implement desired methoods to test algorithm
public class FindMaxTimingExperiment extends TimingExperiment {
	private static String problemSizeDescription = "Array Length";
	private static int problemSizeMin = 1000;
	private static int probelmSizeCount = 10;
	private static int problemSizeStep = 10000;
	private static int experimentIterationCount = 1000;
	
	private static final Random rng = new Random();
	
	private Integer[] randomArray;
	
	public static void main(String[] args) {
		TimingExperiment timingExperiment = new FindMaxTimingExperiment();
		
		System.out.println("\n---Computing Timing results---\n");
		
		
	}
	
	public FindMaxTimingExperiment() {
		super(problemSizeDescription, problemSizeMin, probelmSizeCount, problemSizeStep, experimentIterationCount);
	}
	
	protected void setupExperiment(int problemSize) {
		Integer[] randomArray = new Integer[problemSize];
		for(int i = 0; i < problemSize; i++) {
			randomArray[i] = rng.nextInt(problemSize);
		}
	}
	
	protected void runComputation() {
		AlgorithmUtility.findMax(randomArray);
	}

}
