import java.util.Scanner;

public class NumberOfDaysInMonth {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a month to check how many days in that month");
		int month = keyboard.nextInt();
		System.out.println("Enter a year");
		int year = keyboard.nextInt();
		System.out.println(getDaysInMonth(month, year));
	}
	
	public static boolean isLeapYear (int year)
    {
        if (year >= 1 && year <= 9999)
        {
            int a = year%4;
            int b = year%100;
            int c = year%400;
            
            if ((a == 0 && b !=0) || c==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
   public static int getDaysInMonth (int month, int year)
    {
	   if (year <1 || year >9999)
		   return -1;
                
        switch (month)
        {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        	return 31;
        case 2:
        	if (NumberOfDaysInMonth.isLeapYear(year))
        	return 29;
        	else
        	return 28;
        case 4: case 6: case 9: case 11:
        	return 30;
        default:
        	return -1;
        }
    }

}
