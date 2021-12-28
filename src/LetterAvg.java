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
public class LetterAvg extends AbstractVehicle{
	/** letter of the final average */
	private char letterAverage;
	/** ArrayList holds content of vehicleID */
	private ArrayList<String> listVehicleID;
	/**
	 * 
	 * @param letterAverage constructor initialize the letter of final average
	 */
	public LetterAvg (char letterAverage) {
		this.letterAverage = letterAverage;
	}

	@Override
	public int[] calAverage() {
		return null;
	}
	/**
	 * Method to get the letter of final average
	 * return the letter of final average
	 */
	@Override
	public char letterAverage() {
		return letterAverage;
	}
	/**
	 * 
	 * @return The number of VehicleID that begin with letter of final average
	 * @throws FileNotFoundException Signals that an attempt to open the file
	 *                               denoted by a specified pathname has failed
	 * 						         on input error
	 * @throws IOException  The exceptions produced by failed or interrupted I/O operations.
	 */
	public int numberOfVehicleWithLetterAvg() throws FileNotFoundException, IOException {
		listVehicleID = new ArrayList<String>();
		// Using BufferedReader to read the file
		String filePath = new String("VANETdata.txt");
		BufferedReader br = new BufferedReader(new FileReader(filePath)) ;
		String line;
		// Rearrange the file and put the vehicleID from second column to the array
		while ((line = br.readLine()) != null) {
			String [] array = line.trim().split("\\s+");
			if(array[1].length() == 6)
				listVehicleID.add(array[1]);
		}
		br.close();
		int count = 0;
		//Find the vehicleID which start with the letterAverage
		for (int i = 0; i < listVehicleID.size(); ++i) {
			if (listVehicleID.get(i).charAt(0)== letterAverage){
				count++;
			}
		}
		return count;
	}

	/**
	 *  @return The String of the vehicleID which have the first character match with letterAverage
	 */
	public String toString() {
		String bigString = "These vehicles are:";
		for (int i = 0; i < listVehicleID.size(); ++i) {
			/* if the vehicleID in the list have the first letter match with the letter 
			 * of final average then add it to the big String
			 */
			if (listVehicleID.get(i).charAt(0)== letterAverage){
				bigString = bigString + " " + listVehicleID.get(i);
			}
		}
		return bigString; 
	}
}

