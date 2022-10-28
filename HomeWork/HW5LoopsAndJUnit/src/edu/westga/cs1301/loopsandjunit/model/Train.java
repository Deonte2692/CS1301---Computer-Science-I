package edu.westga.cs1301.loopsandjunit.model;

/**
 * Represents a train with some number of cars,
 * that will be printed using Unicode characters.
 * 
 * @author lewisb
 * @version Fall 2022
 */
public class Train {

	private int numCars;
	
	private static String ENGINE = "🚂";
	private static String CABOOSE = "🚌";
	private static final String RAILCAR = "🚃";
	
	/**
	 * Creates a train with the given number of cars.
	 * If the train has zero cars it is just an engine and caboose.
	 * 
	 * @precondition numCars >= 0
	 * @postcondition getNumCars()==numCars
	 * 
	 * @param numCars the number of cars (excepting engine and caboose)
	 *  for the train
	 */
	

		
	
	public Train(int numCars) {
		if (numCars < 0) {
			throw new IllegalArgumentException("numCars should be > 0");
		}
		
		this.numCars = numCars;
	}
	
	/**
	 * Gets the number cars in the train,
	 * not including the engine and caboose.
	 * 
	 * @return the number of cars
	 */
	public int getNumCars() {
		return this.numCars;
	}
	
	/**
	 * Returns the total length of the train.
	 * 
	 * @return the total length of the train, including the
	 * engine and caboose
	 */
	public int length() {
		return this.numCars + 2;
	}
	
	/**
	 * Builds a unicode train consisting of an engine,
	 * followed by getNumCars() railcars, followed by a
	 * caboose. A train will always have at least an engine
	 * and a caboose.
	 * 
	 * @return a Unicode string as described above.
	 */
	public String getUnicodeString() {
		String train = Train.ENGINE;
		for(int i = 0; i < this.getNumCars(); ++i ){
			train = train + Train.RAILCAR;
		}
		train = train + Train.CABOOSE;
		return train;
	
}
} 