# Project 2: VANET Abstraction
![](Project2_UML.png)

## AbstractVANET
---
- AbstractVANET(vehicleName: String, vehicleNumber: int, vehicleAddress: String): The constructor that initializes the name of company or vehicle, the index number of vehicle number, and the present address
- getName(): retrun the String of vehicle name
- getAddress(): return the String of present address
- setAddress(newAddress:String): set up the address
- getNumber(): return the index number of the vehicle
- mailPriceCheck(): To send/mail the price for a vehicle as a check
- toString(): print out a String with vehicle name, address and index number of the vehicle

## InheritDateTime 
- daysOfAnyMonth(int month, int year): given the month and year, this method is to look for the first day and the last day of the given month in the given year

## InheritVANET
- InheritVANET(String vehicleName, int vehicleNumber, String vehicleAddress): The constructor that initializes the name of company or vehicle, the index number of vehicle number, and the present address
- InheritVANET(String vehicleName, int vehicleNumber, String vehicleAddress, int price): The constructor that initializes the name of company or vehicle, the index number of vehicle number, and the present address
and the price of the vehicle
- mailPriceCheck(): The method to print out the output as send/mail the price for a vehicle as a check

## InheritVehicle
- InheritVehicle(Vanet VehID): Constructor initializes the VehicleID
- calAverage(): method to find the average of each VehicleID base on the character and the length of the VehicleID. Then we take that average and round it up and down to get first 2 results. 
The last result is decided based on the the decimal of the average if it's decimal greater or equal to 0.5, we will assign it to round up number otherwise it will be round down number.
Then we take 3 results: ceiling average, floor average, final average and put it into array. Then return that array.
- letterAverage(): method to take the final average that we found then change it to the letter based on the ascii code

## LetterAvg
- LetterAvg (char letterAverage): Constructor to initializes the letter of final average
- calAverage(): we dont use this method and just return null
- letterAverage(): return the letter of final average
- numberOfVehicleWithLetterAvg(): method to go throuth the data file and take all the vehicleID and put it in to the list. Then we find the vehicleID which have the first character match 
with the letter of final average then we count it up and return the count.
- toString(): return The String of the vehicleID which have the first character match with letterAverage

## PosAvg
- PosAvg(String vehID): Constructor initializes the VehicleID and also take all the vehicleID in the data file and put them to the list.
- indexOfVehicle(): The method will look for the vehicleID which matches with the given vehicleID and return the index + 1 because the list start at 0
- toString(): return The String to determine the index of the given vehicleID is average of up to two distances in index.