import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 
 * @author NguyenVu
 * @version 1.0
 */
public class PosAvg {
	/** The list of the vehicleID from the file */
	private ArrayList <String> VehicleID;
	/** The vehicleID to look for*/
	private String vehID;
	/** The Index of the given vehicleID*/
	private int Index;

	/**
	 * 
	 * @param vehID  The vehicleID that was passed in from driver class
	 * @throws FileNotFoundException Signals that an attempt to open the file
	 *                               denoted by a specified pathname has failed
	 * 						         on input error
	 * @throws IOException  The exceptions produced by failed or interrupted I/O operations.
	 */
	// Constructor initialize the vehicle ID and the list of vehicleID from the given file
	public PosAvg(String vehID) throws FileNotFoundException, IOException{
		// Initialize the constructor
		this.vehID = vehID;
		VehicleID = new ArrayList <String>();
		// Use BufferedReader to read the given file
		String filePath = new String("VANETdata.txt");
		BufferedReader br = new BufferedReader(new FileReader(filePath)) ;
		String line;

		while ((line = br.readLine()) != null) {
			// Rearrange data of the file and put the second column of the file into array
			String [] array = line.trim().split("\\s+");
			// If the length of vehicleID is not equal to 6 then don't add into list
			if(array[1].length() == 6)
				VehicleID.add(array[1]);
		}
		br.close();
	}

	/**
	 *  Method to look for the Index of vehicle
	 * @return the index of vehicle
	 */
	public int indexOfVehicle() {

		for (Index = 0; Index < VehicleID.size(); ++Index) {
			if(VehicleID.get(Index).equals(vehID)) {
				return Index+1; //return Index+1 because ArrayList starts at index 0
			}
		}
		// nothing is found then return -1
		return -1;
	}

	/**
	 * @return The String to determine the index of the given vehicleID is average of up to two distances in index.
	 */
	public String toString() {
		return "This index is average of " + VehicleID.get(Index-1) + " and " + VehicleID.get(Index+1)+ ", " + VehicleID.get(Index-2) + " and " + VehicleID.get(Index+2) +", and so on.";

	}


}




