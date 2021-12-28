/**
 * 
 * @author NguyenVu
 *
 */
public class InheritVehicle extends AbstractVehicle {
	/** The vehicleID to look for*/
	private String VehicleID;
	/** The final average */
	private int intAverage;
	/**
	 * 
	 * @param VehID The vehicleID that was passed in from the Driver class
	 */
	// Constructor initializes the VehicleID
	public InheritVehicle(Vanet VehID) {
		this.VehicleID = VehID.getVehicleID();
	}
	/**
	 * @return an array with 3 elements: ceiling average, floor average, final average 
	 *
	 */
	@Override
	public int[] calAverage() {
		int sum = 0;
		// Find the value of each character through ASCII value then add it up to get sum
		for (int i = 0; i < VehicleID.length(); ++i) {
			sum = sum + (int) VehicleID.charAt(i);
		}
		// Find the average of the given VehicleID by take the sum divide by the number of character 
		double average = (double)sum/VehicleID.length();

		// Round up and round down the average
		int avgCeiling = (int) Math.ceil(average);
		int avgFloor = (int) Math.floor(average);

		// Change format of average with 2 decimal
		String str = String.format("%.2f", average);
		// Change format of the average back to double
		average = Double.parseDouble(str);

		// Round the average up if it's decimal > 0.50 and down if decimal < 0.50
		if(average-avgFloor<0.50) {
			intAverage = avgFloor;
		}
		else {
			intAverage = avgCeiling;
		}

		// Make an array with the finding results and put them in order
		int [] arr = new int[3];
		arr[0] = avgCeiling;
		arr[1] = avgFloor;
		arr[2] = intAverage;
		return arr;
	}
	/**
	 * @return The letter based on the final average
	 */
	@Override
	public char letterAverage() {
		// Using type casting to change from int type to char type to get the letter
		char letter = (char) intAverage;
		return letter;
	}
}
