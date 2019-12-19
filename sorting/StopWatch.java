package sorting;

/**
 * Stop Watch utility used to time processes.
 * <p>
 * Has methods to stop, start and reset the <code>StopWatch</code> as well as
 * methods to change modes between milliseconds and nanoseconds. You can also
 * instantiate your stopwatch in nano mode using the {@link #StopWatch(boolean)}
 * constructor.
 * <p>
 * Output:
 * 
 * <pre>
 * Elapsed Time Millis: 0 
 * Elapsed Time Nano: 0
 * 
 * Elapsed Time Nano: 3057267
 *
 * Elapsed Time Nano: 7428593 
 * Elapsed Time Milli: 7
 * </pre>
 * 
 * @author Ray Hedgecock
 *
 */
public class StopWatch {

	/**
	 * Used to keep track of the start time.
	 */
	private long startTime = 0;

	/**
	 * Used to keep track of the stop time.
	 */
	private long stopTime = 0;

	/**
	 * Flag used to keep track of running mode.
	 */
	private boolean running;

	/**
	 * Flag used for mode.
	 */
	private boolean nanoMode;
	
	/**
	 * Title
	 */
	private String title;

	/**
	 * Constructor
	 */
	public StopWatch() {
		this(false);
	}

	/**
	 * Constructor used to set time mode. Set to true to use nanoseconds.
	 * 
	 * @param nanoMode
	 *            Set to true to enable nanosecond mode.
	 */
	public StopWatch(boolean nanoMode) {
		this.running = false;
		this.nanoMode = nanoMode;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Starts the StopWatch.
	 */
	public void start() {
		start(null);
	}
	
	public void start(String title) {
		this.startTime = getCurrentModeTime();
		this.running = true;
		this.title = title;
	}

	/**
	 * Stops the StopWatch.
	 */
	public void stop() {
		this.stopTime = getCurrentModeTime();
		this.running = false;
	}

	/**
	 * Resets the StopWatch.
	 */
	public void reset() {
		this.running = false;
		this.startTime = 0;
		this.stopTime = 0;
	}

	/**
	 * Sets the mode to milliseconds.
	 */
	public void setModeMilli() {
		this.nanoMode = false;
	}

	/**
	 * Sets the mode to nanoseconds.
	 */
	public void setModeNano() {
		this.nanoMode = true;
	}

	/**
	 * Returns elapsed time based on current mode.
	 * 
	 * @return The value representing elapsed time.
	 */
	public long getElapsedTime() {
		long elapsed;
		if (running) {
			elapsed = (getCurrentModeTime() - startTime);
		} else {
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}

	/**
	 * Gets the current time based on current mode.
	 * 
	 * @return The time based on the current mode.
	 */
	private long getCurrentModeTime() {

		long currentTime;

		if (nanoMode) {
			currentTime = System.nanoTime();
		} else {
			currentTime = System.currentTimeMillis();
		}

		return currentTime;
	}
	
	/**
	 * Returns a string representation of the current mode.
	 * 
	 * @return A string representation of the current mode.
	 */
	public String getMode() {		
		return this.nanoMode ? "NANO" : "MILLI";
	}

	/**
	 * Overridden toString method.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();		
		builder.append(this.title);
		builder.append(" StopWatch");
		builder.append(" [getElapsedTime()=");
		builder.append(getElapsedTime());
		builder.append(", getMode()=");
		builder.append(getMode());
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Converts nanoseconds to milliseconds. Loss of precision will occur.
	 * 
	 * @param value
	 *            The time in nanoseconds.
	 * @return The time in milliseconds.
	 */
	public static long convertNanoToMilli(long value) {
		return value / 1000000;
	}

	/**
	 * Converts milliseconds to nanoseconds.
	 * 
	 * @param value
	 *            The time in milliseconds.
	 * @return The time in nanoseconds.
	 */
	public static long convertMilliToNano(long value) {
		return value * 1000000;
	}

	/**
	 * Driver used for testing the StopWatch class.
	 * 
	 * @param args
	 *            The driver arguments.
	 */
	public static void main(String[] args) {

		// Initialize and start stop watch.
		StopWatch sw = new StopWatch();
		sw.start();

		for (int x = 0; x < Integer.MAX_VALUE; x++) {
			// do something
		}

		// Stop and record times. Convert milliseconds to nanoseconds.
		sw.stop();
		long elapsedTime = sw.getElapsedTime();
		System.out.println("Elapsed Time Millis: " + elapsedTime);
		System.out.println("Elapsed Time Nano: " + convertMilliToNano(elapsedTime));

		// Reset and change modes.
		sw.reset();
		sw.setModeNano();

		// Start stop watch.
		sw.start();

		for (int x = 0; x < Integer.MAX_VALUE; x++) {
			// do something
		}

		// Record time without stopping.
		System.out.println("\nElapsed Time Nano: " + sw.getElapsedTime());

		for (int x = 0; x < Integer.MAX_VALUE; x++) {
			// do something
		}

		// Stop and record nanosecond time and convert to milliseconds.
		sw.stop();
		elapsedTime = sw.getElapsedTime();
		System.out.println("\nElapsed Time Nano: " + elapsedTime);
		System.out.println("Elapsed Time Milli: " + convertNanoToMilli(elapsedTime));
		
		System.out.println(sw);

	}

}