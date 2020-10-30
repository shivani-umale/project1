package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LeapYear {
     public static boolean isLeap(int yr) {
    	 Calendar cs=Calendar.getInstance();
    	 cs.set(Calendar.YEAR,yr);
    	 int no=cs.getActualMaximum(Calendar.DAY_OF_YEAR);
    	 if(no>365)
    		 return true;
    	 return false;
    	 
     }
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=2004
		System.out.println("the year is leap  "+isLeap(year));
		
		
		

	}

}
