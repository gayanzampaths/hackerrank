import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;

public class Solution {
    
    static String getDay(String day, String month, String year) {
        String s="";
        String d = day+"/"+month+"/"+year;
        Date ddd = null;
        try{
            ddd = new SimpleDateFormat("dd/MM/yyyy").parse(d);    
        }catch(ParseException e){
            
        }
        
        Calendar c = Calendar.getInstance();
        c.setTime(ddd);
        int dd = c.get(Calendar.DAY_OF_WEEK);
        
        switch(dd){
            case 1: s="SUNDAY";break;
            case 2: s="MONDAY";break;
            case 3: s="TUESDAY";break;
            case 4: s="WEDNESDAY";break;
            case 5: s="THURSDAY";break;
            case 6: s="FRIDAY";break;
            case 7: s="SATURDAY";break;
        }
        
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
