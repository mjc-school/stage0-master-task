package Condition;

public class DaysInMonth {
    public void printDays(int year, int month) {
    	if(year <= 0 || month < 1 || month > 12) {
    		System.out.println("Not Valid");
    	}
    	else {
    		int daysInMonth;
    		
    		int[] daysInNonLeapYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   // 0 because of array start with 0 index
            int[] daysInLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
       
            if (isLeapYear) {
                daysInMonth = daysInLeapYear[month];
            } else {
                daysInMonth = daysInNonLeapYear[month];
            }
            
            System.out.println("Number of days in the month: " + daysInMonth);
        }
    }

    public static void main(String[] args) {
        DaysInMonth myDate = new DaysInMonth();
        
        myDate.printDays(2002, 5);
        myDate.printDays(2003, 2);
    }
}