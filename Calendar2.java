package les1;

//Ввести с консоли дату. Сравнить ее с текущей датой в системе. 
//Вывести отличающиеся части (год, месяц) на экран.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendar2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter the date in format dd/MM/yyyy  ");
        String dtStr = sc.nextLine();
        
        Date dt = new Date();
        try {
            dt = sdf.parse(dtStr);
            System.out.println(dt);
        } catch (ParseException e) {
            System.out.println("Wrong date!!!");
        }
        
        sc.close();
        
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(dt);
        int yourDay = cal1.get(Calendar.DAY_OF_MONTH);
        int yourMon = cal1.get(Calendar.MONTH);
        int yourYear = cal1.get(Calendar.YEAR);
        
        Calendar cal2 = Calendar.getInstance();
        int curDay = cal2.get(Calendar.DAY_OF_MONTH);
        int curMon = cal2.get(Calendar.MONTH);
        int curYear = cal2.get(Calendar.YEAR);
        
        int difDay = Math.abs(curDay - yourDay);
        int difMon = Math.abs(curMon - yourMon);
        int difYear = Math.abs(curYear - yourYear);
                
        System.out.println("The difference between current day and yours is " + difDay);
        System.out.println("The difference between current month and yours is " + difMon);
        System.out.println("The difference between current year and yours is " + difYear);

    }

}
