/**
 * 
 * @author NguyenVu
 * @version 1.0
 */
public class InheritVANET extends AbstractVANET{
	/** The price of the given Vehicle**/
	private int price;
	/**
	 * 
	 * @param vehicleName 		the name of the vehicle as well as the name of the company
	 * @param vehicleNumber 	the index number of a vehicle
	 * @param vehicleAddress 	the present address 
	 */
	// Constructor from AbstractVANET class
	public InheritVANET(String vehicleName, int vehicleNumber, String vehicleAddress) {
		super(vehicleName, vehicleNumber, vehicleAddress);
	}
	/**
	 * 
	 * @param vehicleName	 the name of the vehicle as well as the name of the company
	 * @param vehicleNumber	 the index number of a vehicle
	 * @param vehicleAddress the present address 
	 * @param price			 the price of the vehicle
	 */
	// Constructor with 4 parameters
	public InheritVANET(String vehicleName, int vehicleNumber, String vehicleAddress, int price) {
		super(vehicleName, vehicleNumber, vehicleAddress);
		this.price = price;
	}
	/**
	 * To send/mail the price for a vehicle as a check
	 */
	@Override
	public void mailPriceCheck() {
		System.out.println("Sending check from InheritVANET.");
		System.out.println("Mailing check to " + getName() + " company for price " + price+".");
	}
}

