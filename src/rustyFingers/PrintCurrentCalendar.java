package rustyFingers;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCurrentCalendar {
	
    public static void main(String[] args) {
    	Calendar calendar = new GregorianCalendar();
    	
    	int month = calendar.get(Calendar.MONTH);
    	int year = calendar.get(Calendar.YEAR);
    	
    	System.out.println("         " + getMonthName(month) + " " + year
    			+          "\n------------------------------"
    	        +          "\n Sun Mon Tue Wed Thu Fri Sat");
    	
    	// Get the first day of the month
    	Calendar cal = new GregorianCalendar(year, month, 1);
    	int firstDay = cal.get(Calendar.DAY_OF_WEEK);
    	
    	// Get Number Of Days
    	int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    	
    	for (int i = 1; i < firstDay; i++)
    		System.out.print("    ");
    	
    	for (int day = 1; day <= numberOfDays; day++) {
    		System.out.printf("%4d", day);
    		
    		if ((firstDay + day - 1) % 7 == 0)
    			System.out.println();
    	}
    	
    	
    }
	
	
	public static String getMonthName(int month) {
		String[] monthNames = {"January", "February",  "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
		return monthNames[month];
	}


}
