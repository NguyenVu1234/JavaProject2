import java.time.YearMonth;
/**
 * 
 * @author NguyenVu
 * @version 1.0
 */
public class InheritDateTime extends AbstractDateTime{
	/**
	 * @param month the month of the year to search 
	 * @param year the year to search
	 */
	@Override
	public void daysOfAnyMonth(int month, int year) {
		// create the object from class YearMonth
		YearMonth ym = YearMonth.of(year, month);
		// Look for the first day of the first week of the month
		String firstDay = ym.atDay(1).getDayOfWeek().name();
		// Look for the last day of the last week of the month
		String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		// Print the output
		System.out.println("In the year " + year + ", for the " + month +"th month: the first day is " + firstDay +" and the last day is " + lastDay);
	}

}
