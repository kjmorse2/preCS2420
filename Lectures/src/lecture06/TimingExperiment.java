package lecture06;

// PROBLEM: public static <E extends comparable<?super E>> E findMax(E[] arr); 
// generic methood for comparing, but use integers for easiest starting point
// parent class, setting up parameters for subclass to perform a timing experiment on a designed methood
public abstract class TimingExperiment {
	// public TimingExperiment();{
		protected String problemSizeDescription;
		protected int problemSizeMin;
		protected int problemSizeCount;
		protected int problemSizeStep;
		protected int experimentIterationCount;
		public TimingExperiment(...) {,,,} // take parameters 
		public void printResults() {,,,}
		protected long computeMedianElapsedTime(int problemSize ) {,,,};
		protected long computeElapsedTime(int problemSize) {,,,};
		protected abstract void setupExperiment(int problemSize); // setup array of problemSize, use E
		protected abstract void runComputation();
// 	}

}
